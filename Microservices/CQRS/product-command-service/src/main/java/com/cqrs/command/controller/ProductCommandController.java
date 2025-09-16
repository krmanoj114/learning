package com.cqrs.command.controller;

import com.cqrs.command.dto.ProductEvent;
import com.cqrs.command.entity.Product;
import com.cqrs.command.service.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductCommandController {

    @Autowired
    private ProductCommandService commandService;

    @PostMapping
    public Product createProduct(@RequestBody ProductEvent productEvent){

        return commandService.createProduct(productEvent);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody ProductEvent productEvent){
        return commandService.updateProduct(id, productEvent);
    }


}
