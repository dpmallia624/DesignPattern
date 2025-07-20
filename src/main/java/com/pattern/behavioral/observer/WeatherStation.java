package com.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Weather {

    private final List<Observer> observers;
    private double temperature, humidity, pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObservers(Observer observer) {
        observers.remove(observer);
    }

    public void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
