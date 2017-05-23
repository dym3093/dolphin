package com.dayton.dolphin.threadCore.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * Created by bruce on 17-5-21.
 */
public class MyExecutor extends Thread{

    private int index;

    public MyExecutor(int index){
        setIndex(index);
    }

    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0; i<10; i++){
            executorService.execute(new MyExecutor(i));
        }
        System.out.println("submit finish");
        executorService.shutdown();
    }

    public void run(){
        System.out.println("["+getIndex()+"] start ...");
        try {
            Thread.sleep((long) (Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("["+getIndex()+"] stop ...");
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
