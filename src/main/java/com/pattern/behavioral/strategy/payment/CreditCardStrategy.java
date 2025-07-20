package com.pattern.behavioral.strategy.payment;

public class CreditCardStrategy implements PaymentStrategy{

    private final String cardNumber, expireDate, name;
    private final int cvv;

    public CreditCardStrategy(String cardNumber, String expireDate, String name, int cvv) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.name = name;
        this.cvv = cvv;
    }


    @Override
    public void pay(double totalPrice) {
        System.out.println("Paid amount "+ totalPrice+ " using credit card @" +cardNumber);
    }
}
