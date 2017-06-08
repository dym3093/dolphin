package com.dayton.dolphin.threadInner.chap04.part02;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by bruce on 17-6-8.
 */
public class RWService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    private ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

    public void read(){
        try {
            readLock.lock();
            System.out.println("Thread[" + Thread.currentThread().getName() + "]"
                    + "获取了[读锁]");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread[" + Thread.currentThread().getName() + "]"
                    + "释放了[读锁]");
            readLock.unlock();
        }
    }

    public void write(){
        try {
            writeLock.lock();
            System.out.println("Thread[" + Thread.currentThread().getName() + "]"
                    + "获取了[写锁]");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread[" + Thread.currentThread().getName() + "]"
                    + "释放了[写锁]");
            writeLock.unlock();
        }
    }

}
