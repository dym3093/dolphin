package com.dayton.dolphin.threadInner.chap03.part02;

/**
 * Created by bruce on 17-6-6.
 */
public class ThreadC extends Thread{

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }

}
