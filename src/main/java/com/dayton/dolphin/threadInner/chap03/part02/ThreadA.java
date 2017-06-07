package com.dayton.dolphin.threadInner.chap03.part02;

/**
 * Created by bruce on 17-6-6.
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        try {
            for (int i=0; i<100; i++){
                TestTools.local.set("ThreadA["+(i+1)+"]");
                System.out.println("ThreadA get Value = "
                        + TestTools.local.get() );
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
