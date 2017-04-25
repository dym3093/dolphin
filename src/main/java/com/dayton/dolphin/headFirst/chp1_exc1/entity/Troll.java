package com.dayton.dolphin.headFirst.chp1_exc1.entity;

import com.dayton.dolphin.headFirst.chp1_exc1.service.BowAndArrowBehavior;

/**
 * Created by root on 17-1-23.
 */
public class Troll extends Character{

    public Troll() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
