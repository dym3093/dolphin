package com.dayton.dolphin.headFirst.chp1_exc1.entity;

import com.dayton.dolphin.headFirst.chp1_exc1.service.KnifeBehavior;

/**
 * Created by root on 17-1-23.
 */
public class Queen extends Character {

    public Queen(){
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
       weaponBehavior.useWeapon();
    }

}
