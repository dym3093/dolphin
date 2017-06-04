package com.dayton.dolphin.threadInner.chap02.part03;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by bruce on 17-6-4.
 */
public class AddCountThread extends Thread{

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            System.out.println("count = "+count.incrementAndGet());
        }
    }
}
