package com.dayton.dolphin.threadInner.chap04.part01;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bruce on 17-6-7.
 */
public class Chap04Service {

    private ReentrantLock lock = new ReentrantLock();

    public void show(){
        try {
            lock.lock();
            System.out.println(" Method [show] begin "
                    + "Thread["+Thread.currentThread().getName()+"]"
                    + " , time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" Method [show] end "
                    + "Thread["+Thread.currentThread().getName()+"]"
                    + " , time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
           lock.unlock();
        }
    }

    public void display(){
        try {
            lock.lock();
            System.out.println(" Method [display] begin "
                    + "Thread["+Thread.currentThread().getName()+"]"
                    + " , time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" Method [display] end "
                    + "Thread["+Thread.currentThread().getName()+"]"
                    + " , time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
           lock.unlock();
        }
    }

}
