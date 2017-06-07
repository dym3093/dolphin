package com.dayton.dolphin.threadInner.chap04.part01;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by bruce on 17-6-7.
 */
public class Chap04Part01Demo {

    public static void main(String[] args){
        Chap04Part01Demo demo = new Chap04Part01Demo();
//        demo.testLockOne();
        demo.testConditionOne();

    }

    public void testConditionOne(){
        try {
            MyService service = new MyService();
            ThreadA a = new ThreadA(service);
            a.start();
            ThreadB b = new ThreadB(service);
            b.start();
            Thread.sleep(3000);
            service.signalAll_A();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void testLockOne(){
        Chap04Service service = new Chap04Service();
        ServiceThread t1 = new ServiceThread(service);
        ServiceThread t2 = new ServiceThread(service);
        ServiceThread t3 = new ServiceThread(service);
        ServiceThread t4 = new ServiceThread(service);
        ServiceThread t5 = new ServiceThread(service);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
