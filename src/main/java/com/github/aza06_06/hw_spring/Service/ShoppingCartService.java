package com.github.aza06_06.hw_spring.Service;

import com.github.aza06_06.hw_spring.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ShoppingCartService {

    private final Map<String, ShoppingCart> shoppingCarts = new ConcurrentHashMap<>();

    public ShoppingCart getShoppingCart(String sessionId) {
        return new ShoppingCart();
                /*shoppingCarts.computeIfAbsent(sessionId, key -> new ShoppingCart());*/
    }

    public void addItem(String sessionId, int itemId) {
        ShoppingCart shoppingCart = new ShoppingCart();
                /*getShoppingCart(sessionId);*/
        shoppingCart.getItemIds().add(itemId);
        shoppingCart.put(sessionId, shoppingCart);
    }

    public List<Integer> getItems(String sessionId) {
        ShoppingCart shoppingCart = getShoppingCart(sessionId);
        if (shoppingCart == null) {
            return null;
        }
        return shoppingCart.getItemIds();
    }

}

