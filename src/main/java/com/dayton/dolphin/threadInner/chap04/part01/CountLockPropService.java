package com.dayton.dolphin.threadInner.chap04.part01;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 测试锁相关数据
 * Created by bruce on 17-6-8.
 */
public class CountLockPropService {

    private ReentrantLock lock = new ReentrantLock();
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    public void draw(){
        try {
            lock.lock();
            System.out.println(" draw getHoldCount = " + lock.getHoldCount());
            show();
        } finally {
            lock.unlock();
        }

    }

    public void show(){
        try {
            lock.lock();
            System.out.println(" show getHoldCount = " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }

    public void letItSleep(){
        try {
            lock.lock();
            System.out.println(" Thread[" + Thread.currentThread().getName()
                                + "] 进入方法 letItSleep ");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public ReentrantLock getLock() {
        return lock;
    }

    public void setLock(ReentrantLock lock) {
        this.lock = lock;
    }

}
