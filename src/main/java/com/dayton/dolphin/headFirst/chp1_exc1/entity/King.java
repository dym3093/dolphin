package com.dayton.dolphin.headFirst.chp1_exc1.entity;

import com.dayton.dolphin.headFirst.chp1_exc1.service.SwordBehavior;

/**
 * Created by root on 17-1-23.
 */
public class King extends Character{

    public King(){
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
