package org.pattern.behavioral.strategy.travel;

public class WalkTravelStrategy implements TravelStrategy{
    @Override
    public void travel(String source, String destination) {
        System.out.println("Travelling by walk from "+ source + " to "+ destination);
    }
}
