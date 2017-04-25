package com.dayton.dolphin.headFirst.chp1_exc1.service;

/**
 * Created by root on 17-1-23.
 */
public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println(" use "+this.getClass().getSimpleName());
    }
}
