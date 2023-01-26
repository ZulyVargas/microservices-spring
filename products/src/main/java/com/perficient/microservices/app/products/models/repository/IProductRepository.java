package com.perficient.microservices.app.products.models.repository;

import com.perficient.microservices.app.products.models.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
