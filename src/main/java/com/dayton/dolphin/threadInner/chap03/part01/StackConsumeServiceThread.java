package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class StackConsumeServiceThread extends Thread{

    private StackConsumeService service;

    public StackConsumeServiceThread(StackConsumeService service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            service.cunsumeService();
        }
    }
}
