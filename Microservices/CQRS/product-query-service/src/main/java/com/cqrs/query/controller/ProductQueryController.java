package com.cqrs.query.controller;

import com.cqrs.query.entity.Product;
import com.cqrs.query.service.ProductQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductQueryController {

    @Autowired
    private ProductQueryService queryService;

    /*@PostMapping
    public Product createProduct(@RequestBody ProductEvent productEvent){

        return queryService.createProduct(productEvent);
    }*/

    @GetMapping
    public List<Product> fetchAllProducts(){
        return queryService.getProducts();
    }





    /*@PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return commandService.updateProduct(id, product);
    }*/


}
