package com.dayton.dolphin.threadInner.chap04.part01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bruce on 17-6-7.
 */
public class FairLockService {

    private ReentrantLock lock;
    private Condition condition;

    public FairLockService(boolean fair) {
        lock = new ReentrantLock(fair);
        condition = lock.newCondition();
    }

    public void fetchLock(){
        if (lock.tryLock()){
            System.out.println(Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println(Thread.currentThread().getName() + "没有获得锁");
        }
    }

    public void waitMethod(){
        try {
//            lock.lockInterruptibly();
            lock.lock();
            System.out.println(" lock begin " + Thread.currentThread().getName());
            for (int i=0; i<10000; i++){
                String str = new String();
                Math.random();
            }
            System.out.println(" lock end " + Thread.currentThread().getName());
        } finally {
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }

    public void action(){
        try {
            lock.lock();
            System.out.println("Thread["+Thread.currentThread().getName()
                    + "] 获得锁");
        } finally {
            lock.unlock();
        }
    }
}
