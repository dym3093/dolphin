package com.dayton.dolphin.threadInner.chap04.part01;

/**
 * Created by bruce on 17-6-7.
 */
public class ThreadA extends Thread{

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
