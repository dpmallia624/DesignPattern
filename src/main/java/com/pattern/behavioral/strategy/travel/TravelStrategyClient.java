package com.pattern.behavioral.strategy.travel;

public class TravelStrategyClient {

    public static void main(String[] args) {
        // car strategy
        TravelPlanner travelPlanner = new TravelPlanner(new CarTravelStrategy());
        travelPlanner.planTravel("home", "office");

        // cycle strategy
        travelPlanner = new TravelPlanner(new CarTravelStrategy());
        travelPlanner.planTravel("office", "park");

        // walk strategy
        travelPlanner = new TravelPlanner(new WalkTravelStrategy());
        travelPlanner.planTravel("park", "restaurant");

    }
}
