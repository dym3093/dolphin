package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * Created by root on 17-1-27.
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
