package com.pattern.behavioral.strategy.payment;

public class PaymentStrategyClient {

    public static void main(String[] args) {
        // Create shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("Shirt", "prd-0001", 1200.00));
        shoppingCart.addItem(new Item("Pant", "prd-0002", 900.00));
        shoppingCart.addItem(new Item("T-Shirt", "prd-0003", 1000.00));
        shoppingCart.addItem(new Item("Cap", "prd-0004", 500.00));

        // Credit card Strategy
        shoppingCart.pay(new CreditCardStrategy("1234-4567-6789", "2026-02-08", "Mathew Brain", 345));

        // Paypal Strategy
        shoppingCart.pay(new PaypalStrategy("brain@home.com"));

        // UPI Strategy
        shoppingCart.pay(new UpiStrategy("brain@hdfcbank"));

    }
}
