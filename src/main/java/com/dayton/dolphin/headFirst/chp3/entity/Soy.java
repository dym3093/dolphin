package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * 豆浆
 * Created by root on 17-1-27.
 */
public class Soy extends CondimentDecorator{

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDecription() {
        return getBeverage().getDescription()+ "Soy";
    }

    @Override
    public double cost() {
        return 0.15+getBeverage().cost();
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

}
