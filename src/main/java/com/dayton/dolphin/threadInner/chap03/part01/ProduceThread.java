package com.dayton.dolphin.threadInner.chap03.part01;


/**
 * 生产者线程
 * Created by bruce on 17-6-4.
 */
public class ProduceThread extends Thread{

    private Producer producer;

    public ProduceThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.produce();
        }
    }

}
