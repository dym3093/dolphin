package com.dayton.dolphin.threadInner.chap02.part01;


/**
 * Created by bruce on 17-6-3.
 */
public class ThreadApple extends Thread{

    private MyObject object;

    public ThreadApple(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.methodA();
    }

}
