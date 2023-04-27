package com.github.aza06_06.hw_spring.controller;

import com.github.aza06_06.hw_spring.Service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")

public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @PostMapping("/add")
    public void addItem(@RequestParam String sessionId, @RequestParam int itemId) {
        shoppingCartService.addItem(sessionId, itemId);
    }

    @GetMapping("/get")
    public List<Integer> getItems(@RequestParam String sessionId) {
        return shoppingCartService.getItems(sessionId);
    }
}
