package com.dayton.dolphin.threadInner.chap02.part02;

/**
 * Created by bruce on 17-6-3.
 */
public class WashThreadTwo extends Thread{

    private MyTask myTask;

    public WashThreadTwo(MyTask myTask) {
        this.myTask = myTask;
    }

    @Override
    public void run() {
        CommUtils.startTime = System.currentTimeMillis();
        myTask.washing();
        CommUtils.stopTime = System.currentTimeMillis();
    }

}
