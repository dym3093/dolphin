package com.dayton.dolphin.threadInner.chap02.service;


/**
 * Created by bruce on 17-6-3.
 */
public class ThreadA extends Thread{

    private HasSelfPrivateNum privateNum;

    public ThreadA(HasSelfPrivateNum privateNum) {
        this.privateNum = privateNum;
    }

    @Override
    public void run() {
        privateNum.addI("a");
    }

}
