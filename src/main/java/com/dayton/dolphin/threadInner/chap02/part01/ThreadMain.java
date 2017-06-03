package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * Created by bruce on 17-6-3.
 */
public class ThreadMain extends Thread{

    private SonClazz someClazz;

    public ThreadMain(SonClazz someClazz) {
        this.someClazz = someClazz;
    }

    @Override
    public void run() {
        someClazz.buildingSon();
        Integer.parseInt("a");
    }

}
