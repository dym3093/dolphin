package com.dayton.dolphin.threadInner.chap04.part01;

/**
 * Created by bruce on 17-6-7.
 */
public class ServiceThread extends Thread{

    private Chap04Service service;

    public ServiceThread(Chap04Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.show();
    }
}
