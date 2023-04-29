package com.github.aza06_06.hw_spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "prototype")

public class ShoppingCart {
    private List<Integer> itemIds = new ArrayList<>();

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }

    public void put(String sessionId, ShoppingCart shoppingCart) {
    }
}

