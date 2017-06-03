package com.dayton.dolphin.threadInner.chap02.part02;

/**
 * Created by bruce on 17-6-3.
 */
public class MyServiceThread extends Thread{

    private MyService service;

    public MyServiceThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setParam("John", "117");
    }
}
