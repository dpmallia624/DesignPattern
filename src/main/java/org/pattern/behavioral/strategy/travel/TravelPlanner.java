package org.pattern.behavioral.strategy.travel;

public class TravelPlanner {

    TravelStrategy travelStrategy;

    public TravelPlanner(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void planTravel(String source, String destination){
        this.travelStrategy.travel(source, destination);
    }
}
