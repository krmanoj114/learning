package com.cqrs.query.service;

import com.cqrs.query.dto.ProductEvent;
import com.cqrs.query.entity.Product;
import com.cqrs.query.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductQueryService {

    @Autowired
    private ProductRepository repository;


    public List<Product> getProducts(){
        return repository.findAll();
    }

    /*public Product createProduct(ProductEvent productEvent){
        Product productDTO = repository.save(productEvent.getProduct());
        ProductEvent event = new ProductEvent("CreateProduct", productDTO);
        kafkaTemplate.send("product-event-topic", event);
        return productDTO;
    }*/

    @KafkaListener(topics = "product-event-topic", groupId = "product-event-group")
    public void processProductEvents(ProductEvent productEvent){
        try{
            System.out.println("productEvent.getEventType()" + productEvent.getEventType()+">>>>"+productEvent.getProduct().getName());
            if(productEvent != null && productEvent.getEventType() != null){
                Product product = productEvent.getProduct();
                if(productEvent.getEventType().equalsIgnoreCase("CreateProduct")){
                    repository.save(product);
                } else if (productEvent.getEventType().equalsIgnoreCase("UpdateProduct")) {
                    Product existingProduct = repository.findById(product.getId()).get();
                    existingProduct.setName(product.getName());
                    existingProduct.setDescription(product.getDescription());
                    existingProduct.setPrice(product.getPrice());
                    repository.save(existingProduct);
                }
            }

        }catch (Exception e){
            System.out.println(e.fillInStackTrace());

        }

    }

}
