package com.dayton.dolphin.headFirst.chp1.service;

/**
 * Created by root on 17-1-22.
 */
public class Squeak implements QuackBehavior{
    /**
     * 鸭子的叫声
     */
    public void quack() {
        System.out.println("吱吱叫...");
    }
}
