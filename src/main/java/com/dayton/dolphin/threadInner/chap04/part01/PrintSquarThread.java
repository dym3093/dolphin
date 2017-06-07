package com.dayton.dolphin.threadInner.chap04.part01;

/**
 * Created by bruce on 17-6-7.
 */
public class PrintSquarThread extends Thread{

    private PrintService service;

    public PrintSquarThread(PrintService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i=0; i<5000; i++) {
            service.get();
        }
    }
}
