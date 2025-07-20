package com.pattern.behavioral.strategy.travel;

public class CycleTravelStrategy implements TravelStrategy{
    @Override
    public void travel(String source, String destination) {
        System.out.println("Travelling by cycle from "+ source + " to "+ destination);
    }
}
