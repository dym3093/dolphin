package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * 饮料类
 * Created by root on 17-1-27.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    private double size;

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
