package com.perficient.microservices.app.items.service;

import com.perficient.microservices.app.items.models.entity.Item;
import java.util.List;

public interface IItemService {

    List<Item> findAll();

    Item findById(Long id, Integer amount);
}