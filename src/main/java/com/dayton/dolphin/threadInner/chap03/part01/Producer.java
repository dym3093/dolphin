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
                    lock.wait();
                }
                String value = System.currentTimeMillis()+"_"
                                + System.nanoTime();
                System.out.println(" produce 的值 "+value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
