package org.pattern.behavioral.strategy.payment;

public class PaypalStrategy implements PaymentStrategy{
    private final String email;

    public PaypalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double totalPrice) {
        System.out.println("Paid amount "+ totalPrice+ " using paypal @" +email);
    }
}
