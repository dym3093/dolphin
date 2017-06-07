package com.dayton.dolphin.threadInner.chap03.part02;

/**
 * Created by bruce on 17-6-6.
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        for (int i=0; i<Integer.MAX_VALUE; i++){
            String str = new String();
            Math.random();
        }
    }
}
