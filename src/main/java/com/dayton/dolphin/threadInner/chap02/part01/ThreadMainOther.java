package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * Created by bruce on 17-6-3.
 */
public class ThreadMainOther extends Thread{

    private SonClazz someClazz;

    public ThreadMainOther(SonClazz someClazz) {
        this.someClazz = someClazz;
    }

    @Override
    public void run() {
        someClazz.buildingSon();
    }

}
