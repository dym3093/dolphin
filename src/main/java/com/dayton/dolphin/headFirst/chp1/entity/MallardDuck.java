package com.dayton.dolphin.headFirst.chp1.entity;

import com.dayton.dolphin.headFirst.chp1.service.FlyWithWings;
import com.dayton.dolphin.headFirst.chp1.service.Quack;

/**
 * Created by root on 17-1-22.
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName());
    }

}
