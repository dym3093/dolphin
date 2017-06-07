package com.dayton.dolphin.threadInner.chap03.part02;

import com.dayton.dolphin.threadInner.chap02.part03.RandomSleepThread;


/**
 * Created by bruce on 17-6-5.
 */
public class DemoPart02 {

    public static void main(String[] args){
        DemoPart02 demo = new DemoPart02();
//        demo.testRandomSleep();
//        demo.testJoin();
        demo.testThreadLocal();
    }

    public void testRandomSleep(){
        try {
            RandomSleepThread sleepThread = new RandomSleepThread();
            sleepThread.start();
            sleepThread.join();
            System.out.println("SleepThread 线程执行完后我再执行...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void testJoin(){
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void testThreadLocal(){
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
        try {
            for (int i=0; i<100; i++){
                TestTools.local.set("Main["+(i+1)+"]");
                System.out.println("Main get Value = "
                        + TestTools.local.get() );
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
