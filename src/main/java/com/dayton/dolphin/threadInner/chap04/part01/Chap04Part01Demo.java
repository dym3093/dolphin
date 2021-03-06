package com.dayton.dolphin.threadInner.chap04.part01;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by bruce on 17-6-7.
 */
public class Chap04Part01Demo {

    public static void main(String[] args){
        Chap04Part01Demo demo = new Chap04Part01Demo();
//        demo.testLockOne();
//        demo.testConditionOne();
//        demo.testPrintService();
//        demo.testFairLock();
//        demo.testCountLockProp();
//        demo.testCountLockPropTwo();
        demo.testInterrupt();
    }

    public void testInterrupt(){
        final FairLockService service = new FairLockService(false);
        Runnable runnable = () -> service.fetchLock();
        Thread a = new Thread(runnable);
        a.setName("A");
        a.start();
        Thread b = new Thread(runnable);
        b.setName("B");
        b.start();
    }

    public void testCountLockPropTwo(){
        try {
            CountLockPropService service = new CountLockPropService();
            Runnable runnable = () -> service.letItSleep();

            Thread[] threads = new Thread[10];
            for (int i=0; i<10; i++){
                threads[i] = new Thread(runnable);
            }

            for (int i=0; i<10; i++){
                threads[i].start();
            }
            Thread.sleep(2000);
            System.out.println(" 等待的线程数量： " + service.getLock().getQueueLength() );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void testCountLockProp(){
        CountLockPropService service = new CountLockPropService();
        service.draw();
    }

    public void testFairLock(){
        FairLockService service = new FairLockService(true);

        Runnable runnable = () -> {
            System.out.println("线程["+Thread.currentThread().getName()+"] 运行了");
            service.action();
        };

        Thread[] threads = new Thread[20];

        for (int i=0; i<20; i++){
            threads[i] = new Thread(runnable);
        }

        for (int i=0; i<20; i++){
            threads[i].start();
        }
    }

    public void testPrintService(){
        PrintService service = new PrintService();
        PrintStarThread[] starThreads = new PrintStarThread[10];
        PrintSquarThread[] squarThreads = new PrintSquarThread[10];
        for (int i=0; i<10; i++) {
            starThreads[i] = new PrintStarThread(service);
            squarThreads[i] = new PrintSquarThread(service);
            starThreads[i].start();
            squarThreads[i].start();
        }

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
