package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * 生产者
 * Created by bruce on 17-6-4.
 */
public class Producer {

    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void produce(){
        try {
            synchronized (lock){
                if (!ValueObject.value.equals("")){
                    System.out.println(" 生产者["+Thread.currentThread().getName()+"] waiting 了");
                    lock.wait();
                }
                System.out.println(" 生产者["+Thread.currentThread().getName()+"] runnable 了");
                String value = System.currentTimeMillis()+"_"
                                + System.nanoTime();
                System.out.println(" produce 的值 "+value);
                ValueObject.value = value;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
