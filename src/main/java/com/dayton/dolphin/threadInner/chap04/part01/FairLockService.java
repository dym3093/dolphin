package com.dayton.dolphin.threadInner.chap04.part01;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bruce on 17-6-7.
 */
public class FairLockService {

    private ReentrantLock lock;

    public FairLockService(boolean fair) {
        lock = new ReentrantLock(fair);
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
