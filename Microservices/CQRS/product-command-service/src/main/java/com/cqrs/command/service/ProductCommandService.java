package com.cqrs.command.service;

import com.cqrs.command.dto.ProductEvent;
import com.cqrs.command.repository.ProductRepository;
import com.cqrs.command.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductCommandService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public Product createProduct(ProductEvent productEvent){
        Product productDTO = repository.save(productEvent.getProduct());
        ProductEvent event = new ProductEvent("CreateProduct", productDTO);
        kafkaTemplate.send("product-event-topic", event);
        return productDTO;
    }

    public Product updateProduct(Long id, ProductEvent productEvent){
        Product existingProduct = repository.findById(id).get();
        Product newProduct = productEvent.getProduct();
        existingProduct.setName(newProduct.getName());
        existingProduct.setPrice(newProduct.getPrice());
        existingProduct.setDescription(newProduct.getDescription());
        Product productDTO = repository.save(existingProduct);
        ProductEvent event = new ProductEvent("UpdateProduct", productDTO);
        kafkaTemplate.send("product-event-topic", event);
        return productDTO;

    }
}
