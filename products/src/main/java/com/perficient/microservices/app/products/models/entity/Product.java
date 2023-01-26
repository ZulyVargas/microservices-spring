package com.perficient.microservices.app.products.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double cost;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}