package com.github.aza06_06.hw_spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope

public class ShoppingCart {
    private final List<Integer> itemIds = new ArrayList<>();

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void add(List<Integer> ids) {
        itemIds.addAll(ids);
    }
}

