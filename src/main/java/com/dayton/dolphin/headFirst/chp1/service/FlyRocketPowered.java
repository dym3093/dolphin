package com.dayton.dolphin.headFirst.chp1.service;

/**
 * Created by root on 17-1-23.
 */
public class FlyRocketPowered implements FlyBehavior{

    /**
     * 飞行的动作
     */
    @Override
    public void fly() {
        System.out.println("Fly with Rocket!!!");
    }
}
