package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * 摩卡咖啡
 * Created by root on 17-1-27.
 */
public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDecription() {
        return beverage.getDescription() +" , Mocha "+" Coffee";
    }

    @Override
    public double cost() {
        return 0.2 + getBeverage().cost();
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

}
