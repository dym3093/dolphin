package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class StackProduceServiceThread extends Thread{

    private StackProduceService service;

    public StackProduceServiceThread(StackProduceService service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            service.pushService();
        }
    }
}
