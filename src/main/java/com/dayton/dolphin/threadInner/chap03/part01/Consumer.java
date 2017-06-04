package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class Consumer {

    private String lock;

    public Consumer(String lock) {
        this.lock = lock;
    }

    public void consume(){
        try {
            synchronized (lock){
                if ("".equals(ValueObject.value)){
                    //没有东西，等待消息
                    System.out.println(" 消费者["+Thread.currentThread().getName()+"] waiting 了");
                    lock.wait();
                }
                System.out.println(" 消费者["+Thread.currentThread().getName()+"] runnable 了");
                System.out.println(" consume 的值： "+ValueObject.value);
                ValueObject.value = "";
                //通知生产者已经消费，可以继续生产
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
