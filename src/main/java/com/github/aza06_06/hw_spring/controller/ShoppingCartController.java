package com.github.aza06_06.hw_spring.controller;

import com.github.aza06_06.hw_spring.Service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public void addItem(@RequestParam List<Integer> ids) {
        shoppingCartService.addItem(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return shoppingCartService.getItems();
    }

}

