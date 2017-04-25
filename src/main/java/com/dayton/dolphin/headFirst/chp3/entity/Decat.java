package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * 低咖啡因
 * Created by root on 17-1-27.
 */
public class Decat extends Beverage{

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
