package com.pattern.observer;

public class GeneralDisplay implements Observer{

    private double  temperature,  humidity,  pressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.humidity=humidity;
        this.pressure=pressure;
        this.temperature=pressure;
        display();
    }

    private void display(){
        System.out.println("Current condition: temperature "+ temperature + "F degree, humidity "+ humidity+
                "% and pressure "+ pressure+ " miles/hour");
    }
}
