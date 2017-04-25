package com.dayton.dolphin.test.demo;

import com.dayton.dolphin.headFirst.chp1.entity.DuckCall;

import java.util.Observer;

/**
 * Created by root on 17-1-23.
 */
public class DuckDemo {

    public static void main(String[] args){
        //sound();
        Observer ob = null;
    }

    public static void sound(){
        new DuckCall().quack();
    }
}
