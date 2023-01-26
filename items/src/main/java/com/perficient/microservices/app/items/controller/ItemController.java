package com.perficient.microservices.app.items.controller;

import com.perficient.microservices.app.items.models.entity.Item;
import com.perficient.microservices.app.items.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private IItemService itemService;

    @GetMapping("/items")
    public List<Item> findAll() {
        return itemService.findAll();
    }

    @GetMapping("/item/{id}/amount/{amount}")
    public Item detail(@PathVariable Long id, @PathVariable Integer amount) {
        return itemService.findById(id, amount);
    }


}
