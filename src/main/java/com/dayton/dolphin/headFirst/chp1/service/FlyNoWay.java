package com.dayton.dolphin.headFirst.chp1.service;

/**
 * Created by root on 17-1-22.
 */
public class FlyNoWay implements FlyBehavior{


    /**
     * 飞行的动作
     */
    public void fly() {
        System.out.println(this.getClass().getSimpleName());
    }

}
