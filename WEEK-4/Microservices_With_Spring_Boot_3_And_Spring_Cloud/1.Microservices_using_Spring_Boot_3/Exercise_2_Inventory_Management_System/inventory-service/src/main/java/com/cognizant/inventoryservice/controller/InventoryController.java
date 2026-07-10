package com.cognizant.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.inventoryservice.model.Inventory;

@RestController
public class InventoryController {

    @GetMapping("/inventory/{id}")
    public Inventory getInventory(@PathVariable int id) {

        return new Inventory(
                id,
                "Laptop",
                25
        );
    }
}