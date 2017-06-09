package com.dayton.dolphin.threadInner.chap06;

/**
 * Created by bruce on 17-6-8.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
       System.out.println(MyObject.getInstance().hashCode());
    }
}
