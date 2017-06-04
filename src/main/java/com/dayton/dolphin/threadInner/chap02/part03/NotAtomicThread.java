package com.dayton.dolphin.threadInner.chap02.part03;

/**
 * Created by bruce on 17-6-4.
 */
public class NotAtomicThread extends Thread{

    public static int count;

    public synchronized static void addCount(){
        for (int i=0; i<100; i++){
            count++;
        }
        System.out.println("count = "+count);
    }

    @Override
    public void run() {
        addCount();
    }

}
