package com.pattern.behavioral.strategy.payment;

public class UpiStrategy implements PaymentStrategy{

    private final String upiId;
    UpiStrategy(String upiId){
        this.upiId = upiId;
    }
    @Override
    public void pay(double totalPrice) {
        System.out.println("Paid amount "+ totalPrice+ " using UPI @" +upiId);
    }
}
