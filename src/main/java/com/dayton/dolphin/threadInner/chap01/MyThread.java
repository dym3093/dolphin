package com.dayton.dolphin.threadInner.chap01;

/**
 * Created by bruce on 17-6-2.
 */
public class MyThread extends Thread{

    private SynchronizedObject synchronizedObject;

    public MyThread(SynchronizedObject synchronizedObject) {
        super();
        this.synchronizedObject = synchronizedObject;
    }

    @Override
    public void run() {
        int sum = 0;
        long begin = System.currentTimeMillis();
        for (int i=1; i<=500000; i++){
            Thread.yield();
            System.out.println("i="+i);
            sum += i;
        }
        System.out.println("cost time :"+(System.currentTimeMillis()-begin));
        System.out.println("sum="+sum);
    }
}
