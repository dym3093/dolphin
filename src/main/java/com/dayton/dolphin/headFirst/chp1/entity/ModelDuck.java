package com.dayton.dolphin.headFirst.chp1.entity;

import com.dayton.dolphin.headFirst.chp1.service.FlyNoWay;
import com.dayton.dolphin.headFirst.chp1.service.Quack;

/**
 * Created by root on 17-1-23.
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println(" I'm a "+this.getClass().getSimpleName());
    }
}
