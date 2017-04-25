package com.dayton.dolphin.headFirst.chp1.entity;

import com.dayton.dolphin.headFirst.chp1.service.MuteQuack;
import com.dayton.dolphin.headFirst.chp1.service.QuackBehavior;

/**
 * Created by root on 17-1-23.
 */
public class DuckCall {

    private QuackBehavior quackBehavior;

    public DuckCall(){
        quackBehavior = new MuteQuack();
    }

    public void quack(){
        quackBehavior.quack();
    }

}
