package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class Service {

    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println(" begin wait Thread["
                        +Thread.currentThread().getName()+"]");
                lock.wait();
                System.out.println(" end wait Thread["
                        +Thread.currentThread().getName()+"]");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void syncNotNoitfyMethod(Object lock){
        try {
        synchronized (lock){
            System.out.println(" begin notify Thread["
                    +Thread.currentThread().getName()+"]"
                    + " , time = "+System.currentTimeMillis());
            lock.notify();
            Thread.sleep(5000);
            System.out.println(" end notify Thread["
                    +Thread.currentThread().getName()+"]"
                    + " , time = "+System.currentTimeMillis());
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
