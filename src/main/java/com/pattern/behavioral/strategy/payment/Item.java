package com.pattern.behavioral.strategy.payment;

import java.util.Objects;

public class Item {
    private String name;
    private String code;
    private double price;

    public Item(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
