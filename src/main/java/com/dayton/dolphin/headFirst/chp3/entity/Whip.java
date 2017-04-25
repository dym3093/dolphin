package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * 奶泡
 * Created by root on 17-1-27.
 */
public class Whip extends CondimentDecorator{

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDecription() {
        return beverage.getDescription()+ "Whip";
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
