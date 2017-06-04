package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class ConsumeThread extends Thread{

    private Consumer consumer;

    public ConsumeThread(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true){
            consumer.consume();
        }
    }
}
