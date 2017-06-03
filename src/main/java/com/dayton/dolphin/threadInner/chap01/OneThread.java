package com.dayton.dolphin.threadInner.chap01;

/**
 * Created by bruce on 17-6-3.
 */
public class OneThread extends Thread{

    @Override
    public void run() {
        for (int i=0; i<600; i++) {
            System.out.println(Thread.currentThread().getName() + " start["+i+"]");
            System.out.println("***");
            System.out.println(Thread.currentThread().getName() + " i="+i);
        }
    }
}
