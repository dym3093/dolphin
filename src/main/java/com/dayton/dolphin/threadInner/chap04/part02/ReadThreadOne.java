package com.dayton.dolphin.threadInner.chap04.part02;

/**
 * Created by bruce on 17-6-8.
 */
public class ReadThreadOne extends Thread{

    private RWService service;

    public ReadThreadOne(RWService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
//        service.read();
    }

}
