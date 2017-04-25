package com.dayton.dolphin.threadCore.chap03;/**
 * Created by daimian on 17-4-21.
 */

/**
 * Synchronized Integer
 * used keyword synchronized
 *
 * @author Damian
 * @create 2017-04-21 上午10:21
 **/
public class SyncInteger {
    private int value;

    public SyncInteger(int value){
        setValue(value);
    }

    public synchronized void setValue(int value){
        this.value = value;
    }

    public synchronized int getValue(){
        return this.value;
    }
}
