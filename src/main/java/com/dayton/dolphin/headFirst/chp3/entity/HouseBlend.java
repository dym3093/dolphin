package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * 综合
 * Created by root on 17-1-27.
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
