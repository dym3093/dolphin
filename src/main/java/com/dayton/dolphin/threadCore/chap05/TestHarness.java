package com.dayton.dolphin.threadCore.chap05;/**
 * Created by daimian on 17-5-16.
 */

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁测试
 *
 * @author Damian
 * @create 2017-05-16 上午11:52
 **/
public class TestHarness {

    public long timeTasks(int threads, final Runnable task){
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(threads);

        for (int i=0; i<threads; i++){
            Thread t = new Thread(){
                public void run(){
                    try {
                        startGate.await();
                        task.run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        endGate.countDown();
                    }
                }
            };
            t.start();
        }
        long start = System.nanoTime();
        startGate.countDown();
        try {
            endGate.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        return end-start;
    }
}
