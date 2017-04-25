package com.dayton.dolphin.headFirst.chp1_exc1.entity;

import com.dayton.dolphin.headFirst.chp1_exc1.service.WeaponBehavior;

/**
 * Created by root on 17-1-23.
 */
public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    public abstract void fight();


    public void setWeaponBehavior(WeaponBehavior w){
        this.weaponBehavior = w;
    }
}
