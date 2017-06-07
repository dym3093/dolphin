package com.dayton.dolphin.threadInner.chap04.part01;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现生产者/消费者模式： 一对一打印
 * 交替打印
 * Created by bruce on 17-6-7.
 */
public class PrintService{

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean flag = false;

    public void set(){
        try {
            lock.lock();
            while (flag){
                condition.await();
            }
            System.out.println("**********");
            flag = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get(){
         try {
            lock.lock();
            while (!flag){
                condition.await();
            }
            System.out.println("##########");
            flag = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
