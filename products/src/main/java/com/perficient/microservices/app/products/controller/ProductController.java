package com.perficient.microservices.app.products.controller;

import com.perficient.microservices.app.products.models.entity.Product;
import com.perficient.microservices.app.products.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public List<Product> getAll() {
        return productService.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.findById(id);
    }
}