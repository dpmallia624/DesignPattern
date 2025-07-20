package org.pattern.behavioral.strategy.payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public void pay(PaymentStrategy paymentStrategy){
        double totalPrice = items.stream().mapToDouble(Item::getPrice).sum();
        paymentStrategy.pay(totalPrice);
    }
}
