package com.dayton.dolphin.headFirst.chp2.entity;

import java.util.Observable;
import java.util.Observer;
/**
 * Created by root on 17-1-24.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer{

    private Observable observable;

    private Float temperature;

    private Float humidity;

    public CurrentConditionsDisplay(Observable observable){
        setObservable(observable);
        this.observable.addObserver(this);
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
            setTemperature(weatherData.getTemperature());
            setHumidity(weatherData.getHumidity());
            display();
        }
    }

    /**
     * 显示
     */
    public void display(){
        System.out.println("温度： "+temperature+" 摄氏度, 湿度： "+ humidity+" % ");
    }

    /**
     * 显示内容
     *
     * @param subject 主题
     */
    @Override
    public void display(Subject subject) {

    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    public Observable getObservable(){
        return this.observable;
    }
}
