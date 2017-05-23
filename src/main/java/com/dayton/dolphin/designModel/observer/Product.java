package com.dayton.dolphin.designModel.observer;

import java.util.Observable;

/**
 * Created by bruce on 17-5-23.
 */
public class Product extends Observable{

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //设置变化点
        setChanged();
        //通知监听者
        notifyObservers(name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        setChanged();
        notifyObservers(new Double(price));
    }
}
