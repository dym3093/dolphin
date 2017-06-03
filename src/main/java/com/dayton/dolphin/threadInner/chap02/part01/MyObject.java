package com.dayton.dolphin.threadInner.chap02.part01;


/**
 * Created by bruce on 17-6-3.
 */
public class MyObject {

    public synchronized void methodA(){
        try {
            System.out.println(" begin methodA threadName = "
                    + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println(" methodA end " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
