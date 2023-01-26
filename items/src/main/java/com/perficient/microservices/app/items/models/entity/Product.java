package com.perficient.microservices.app.items.models.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Product {

    private Long id;
    private String name;
    private Double cost;
    private Date createdAt;
}