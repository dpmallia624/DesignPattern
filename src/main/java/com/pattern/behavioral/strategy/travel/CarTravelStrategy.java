package com.pattern.behavioral.strategy.travel;

public class CarTravelStrategy implements TravelStrategy{

    @Override
    public void travel(String source, String destination) {
        System.out.println("Travelling by car from "+ source + " to "+ destination);
    }
}
