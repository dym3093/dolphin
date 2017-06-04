package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class WaitBus extends Thread{

    private Object lock;

    public WaitBus(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                System.out.println("开始 wait time = "+System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time = "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
