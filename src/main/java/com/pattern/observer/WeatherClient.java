package com.pattern.observer;

public class WeatherClient {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.registerObserver(new GeneralDisplay());
        weatherStation.registerObserver(new ForecastDisplay());
        weatherStation.registerObserver(new StatisticsDisplay());

        weatherStation.setMeasurements(67.0, 80.0, 24.0);
    }
}
