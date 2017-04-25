package com.dayton.dolphin.headFirst.chp2.entity;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by root on 17-1-25.
 */
public class ForecastDisplay implements Observer, DisplayElement{

    private Observable observable;

    private Float currentPressure = 29.92f;
    private Float lastPressure;

    public ForecastDisplay(Observable observable){
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
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();

            display();
        }
    }

    /**
     *显示
     */
    public void display(){
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
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
