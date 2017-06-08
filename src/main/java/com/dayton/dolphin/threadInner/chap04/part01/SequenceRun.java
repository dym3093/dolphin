package com.dayton.dolphin.threadInner.chap04.part01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bruce on 17-6-8.
 */
public class SequenceRun {

    private volatile static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition conditionA = lock.newCondition();
    private static Condition conditionB = lock.newCondition();
    private static Condition conditionC = lock.newCondition();

    public static void main(String[] args){

        Thread a = new Thread(() -> {
            try {
                lock.lock();
                if (nextPrintWho!=1){
                    conditionA.await();
                }
                for (int i=0; i<3; i++){
                    System.out.println("ThreadA["+(i+1)+"]");
                }
                nextPrintWho = 2;
                conditionB.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread b = new Thread(() -> {
            try {
                lock.lock();
                if (nextPrintWho!=2){
                    conditionB.await();
                }
                for (int i=0; i<3; i++){
                    System.out.println("ThreadB["+(i+1)+"]");
                }
                nextPrintWho = 3;
                conditionC.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread c = new Thread(() -> {
            try {
                lock.lock();
                if (nextPrintWho!=3){
                    conditionC.await();
                }
                for (int i=0; i<3; i++){
                    System.out.println("ThreadC["+(i+1)+"]");
                }
                nextPrintWho = 1;
                conditionA.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];

        for(int i=0; i<5; i++){
            aArray[i] = new Thread(a);
            bArray[i] = new Thread(b);
            cArray[i] = new Thread(c);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }

    }

}
