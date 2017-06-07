package com.dayton.dolphin.threadInner.chap04.part01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bruce on 17-6-7.
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA(){
        try {
            lock.lock();
            System.out.println(" Method awaitA begin ...");
            System.out.println(" await 的时间为 " + System.currentTimeMillis());
            conditionA.await();
            System.out.println(" Method awaitA end ...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println(" Method awaitB begin ...");
            System.out.println(" await 的时间为 " + System.currentTimeMillis());
            conditionB.await();
            System.out.println(" Method awaitB end ...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A(){
        try {
            lock.lock();
            System.out.println(" Method signalAll_A begin ...");
            System.out.println(" signal 的时间为 " + System.currentTimeMillis());
            conditionA.signalAll();
            System.out.println(" Method signalAll_A end ...");
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B(){
        try {
            lock.lock();
            System.out.println(" Method signalAll_B begin ...");
            System.out.println(" signal 的时间为 " + System.currentTimeMillis());
            conditionB.signalAll();
            System.out.println(" Method signalAll_B end ...");
        } finally {
            lock.unlock();
        }
    }
}
