package com.dayton.dolphin.threadInner.chap02.part02;

/**
 * Created by bruce on 17-6-3.
 */
public class MyServiceThreadOne extends Thread{

    private MyService service;

    public MyServiceThreadOne(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setParam("Kat", "87");
    }

}
