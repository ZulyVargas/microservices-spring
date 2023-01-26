package com.perficient.microservices.app.items.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Product product;
    private Integer amount;

    public Double getTotal() {
        return product.getCost() * amount.doubleValue();
    }

}