package com.pattern.observer.weather;

/**
 * User: shijingui
 * Date: 2016/7/16
 */
public class WeatherStationTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer observer = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(123, 34, 44);
    }
}
