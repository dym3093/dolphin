package com.dayton.dolphin.threadInner.chap02.part02;


/**
 * Created by bruce on 17-6-3.
 */
public class WashThreadOne extends Thread{

    private MyTask myTask;

    public WashThreadOne(MyTask myTask) {
        this.myTask = myTask;
    }

    @Override
    public void run() {
        CommUtils.beginTime = System.currentTimeMillis();
        myTask.washing();
        CommUtils.endTime = System.currentTimeMillis();
    }

}
