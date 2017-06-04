package com.dayton.dolphin.threadInner.chap03.part01;


/**
 * Created by bruce on 17-6-4.
 */
public class BusInfo extends Thread{

    private Object lock;

    public BusInfo(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("开始 notify time = "+System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time = "+System.currentTimeMillis());
        }
    }
}
