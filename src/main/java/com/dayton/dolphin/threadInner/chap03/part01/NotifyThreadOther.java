package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class NotifyThreadOther extends Thread{

    private Object lock;

    public NotifyThreadOther(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println(" begin notify by Thread["
                    + Thread.currentThread().getName()+"]");
            //全部唤醒
            lock.notifyAll();
            System.out.println(" end notify by Thread["
                    + Thread.currentThread().getName()+"]");
        }
    }
}
