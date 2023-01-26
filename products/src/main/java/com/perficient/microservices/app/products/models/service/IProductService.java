package com.perficient.microservices.app.products.models.service;

import com.perficient.microservices.app.products.models.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
}
