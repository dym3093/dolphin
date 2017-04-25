package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * Created by root on 17-1-27.
 */
public class Milk extends CondimentDecorator{

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDecription() {
        return beverage.getDescription()+ "Milk";

    }

    @Override
    public double cost() {
        return 0.1+getBeverage().cost();
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

}
