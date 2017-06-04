package com.dayton.dolphin.threadInner.chap03.part01;

import com.dayton.dolphin.threadInner.chap02.part02.MyList;

/**
 * Created by bruce on 17-6-4.
 */
public class BusManager extends Thread{

    private Object lock;

    public BusManager(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                for (int i=0; i<10; i++){
                    PassengerList.add();
                    if (PassengerList.size() == 5){
                        //发出通知，但未立即释放锁，而是执行完该 synchronized-block 后才释放
                        lock.notify();
                        System.out.println("已经发出通知!!!");
                    }
                    System.out.println("添加了 ["+(i+1)+"] 个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
