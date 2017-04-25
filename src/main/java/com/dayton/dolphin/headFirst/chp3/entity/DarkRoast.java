package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * 深烘
 * Created by root on 17-1-27.
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
