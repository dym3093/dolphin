package com.dayton.dolphin.headFirst.chp2.entity;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by root on 17-1-24.
 */
public class StatisticsDisplay implements Observer, DisplayElement{

    private Observable observable;

    private int numReadings;
    /**
     * 最低温度
     */
    private Float minTemperature = 0.0f;

    /**
     * 平均温度
     */
    private Float avgTemperature = 0.0f;

    /**
     * 最大温度
     */
    private Float maxTemperature = 0.0f;

    private Float sumTemperature = 0.0f;

    /**
     * 最小湿度
     */
    private Float avgHumidity;

    /**
     * 平均湿度
     */
    private Float minHumidity;

    /**
     * 最大湿度
     */
    private Float maxHumidity;


    public StatisticsDisplay(Observable observable){
        setObservable(observable);
        observable.addObserver(this);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData){
            WeatherData weatherData = (WeatherData) arg;
            sumTemperature += weatherData.getTemperature();
            numReadings++;

            if (weatherData.getTemperature()>maxTemperature){
                maxTemperature = weatherData.getTemperature();
            }

            if (weatherData.getTemperature()<minTemperature){
                minTemperature = weatherData.getTemperature();
            }

            //平均温度
            avgTemperature = sumTemperature/numReadings;
        }

    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sumTemperature/ numReadings)
                + "/" + maxTemperature+ "/" + minTemperature);
    }

    /**
     * 显示内容
     *
     * @param subject 主题
     */
    @Override
    public void display(Subject subject) {

    }

    public Observable getObservable() {
        return observable;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

}
