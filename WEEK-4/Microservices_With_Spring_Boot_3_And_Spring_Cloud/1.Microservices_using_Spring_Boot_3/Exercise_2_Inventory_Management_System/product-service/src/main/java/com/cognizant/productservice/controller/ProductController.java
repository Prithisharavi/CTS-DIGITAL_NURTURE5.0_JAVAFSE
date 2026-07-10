package com.cognizant.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.productservice.model.Product;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {

        return new Product(
                id,
                "Laptop",
                25,
                55000.00
        );
    }
}