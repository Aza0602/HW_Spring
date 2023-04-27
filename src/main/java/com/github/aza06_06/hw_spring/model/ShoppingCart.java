package com.github.aza06_06.hw_spring.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Integer> itemIds = new ArrayList<>();

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }
}
