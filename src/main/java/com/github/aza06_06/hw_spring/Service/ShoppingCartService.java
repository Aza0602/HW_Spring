package com.github.aza06_06.hw_spring.Service;

import com.github.aza06_06.hw_spring.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    private final ShoppingCart shoppingCart;

    public ShoppingCartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addItem(List<Integer> ids) {
        shoppingCart.add(ids);
    }

    public List<Integer> getItems() {
        return shoppingCart.getItemIds();
    }

}

