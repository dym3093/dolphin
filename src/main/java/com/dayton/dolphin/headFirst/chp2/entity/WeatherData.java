package com.dayton.dolphin.headFirst.chp2.entity;

import java.util.Observable;

/**
 * 天气预报数据
 * Created by root on 17-1-24.
 */
public class WeatherData extends Observable{

    //温度
    private Float temperature;

    //湿度
    private Float humidity;

    //气压
    private Float pressure;

    public WeatherData(){
    }

    /**
     * 测量值改变
     * @return boolean
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 设置测量值
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void setMeasurements(Float temperature, Float humidity, Float pressure){
       this.setTemperature(temperature);
       this.setHumidity(humidity);
       this.setPressure(pressure);
       measurementsChanged();
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

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }


}
