package com.perficient.microservices.app.products.models.service.impl;

import com.perficient.microservices.app.products.models.entity.Product;
import com.perficient.microservices.app.products.models.repository.IProductRepository;
import com.perficient.microservices.app.products.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}