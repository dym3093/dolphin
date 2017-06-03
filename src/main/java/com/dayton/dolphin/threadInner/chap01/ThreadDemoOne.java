package com.dayton.dolphin.threadInner.chap01;

import org.junit.Test;

/**
 * Created by bruce on 17-6-2.
 */
public class ThreadDemoOne {

    public static void main(String[] args){
        ThreadDemoOne demo = new ThreadDemoOne();
        demo.testOneThread();
    }


    @Test
    public void testMyThread(){
        SynchronizedObject synchronizedObject = new SynchronizedObject();
        MyThread myThread = new MyThread(synchronizedObject);
        myThread.start();
    }


    @Test
    public void testOneThread(){
        OneThread oneThread = new OneThread();
        oneThread.setPriority(2);

        TwoThread twoThread = new TwoThread();
        twoThread.setPriority(8);

        oneThread.start();
        twoThread.start();
    }

}
