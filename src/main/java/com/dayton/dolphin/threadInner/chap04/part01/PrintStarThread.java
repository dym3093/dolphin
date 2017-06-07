package com.dayton.dolphin.threadInner.chap04.part01;

/**
 * Created by bruce on 17-6-7.
 */
public class PrintStarThread extends Thread{

    private PrintService service;

    public PrintStarThread(PrintService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i=0; i<5000; i++) {
            service.set();
        }
    }
}
