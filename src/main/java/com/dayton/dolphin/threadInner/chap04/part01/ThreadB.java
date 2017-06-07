package com.dayton.dolphin.threadInner.chap04.part01;

/**
 * Created by bruce on 17-6-7.
 */
public class ThreadB extends Thread{

    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
