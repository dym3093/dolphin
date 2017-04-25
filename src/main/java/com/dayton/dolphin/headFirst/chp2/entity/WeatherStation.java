package com.dayton.dolphin.headFirst.chp2.entity;

/**
 * Created by root on 17-1-26.
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80f, 65f, 30.4f);
        weatherData.setMeasurements(82f, 70f, 29.2f);
        weatherData.setMeasurements(78f, 90f, 29.2f);

    }
}
