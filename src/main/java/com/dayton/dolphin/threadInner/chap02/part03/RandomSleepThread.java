package com.dayton.dolphin.threadInner.chap02.part03;

/**
 * Created by bruce on 17-6-6.
 */
public class RandomSleepThread extends Thread{

    @Override
    public void run() {
        try {
            int mSec = (int) (Math.random()*1000);
            System.out.println("second: " + mSec + " ms");
            Thread.sleep(mSec);
            System.out.println("Thread["+"] 休眠已经醒了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
