package com.dayton.dolphin.headFirst.chp1_exc1.entity;

import com.dayton.dolphin.headFirst.chp1_exc1.service.AxeBehavior;

/**
 * Created by root on 17-1-23.
 */
public class Knight extends Character {

    public Knight() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
