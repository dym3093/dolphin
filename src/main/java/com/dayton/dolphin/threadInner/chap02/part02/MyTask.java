package com.dayton.dolphin.threadInner.chap02.part02;

/**
 * Created by bruce on 17-6-3.
 */
public class MyTask {
    private String fruit;
    private String vegetables;

    public void washing(){
        try {
            System.out.println("washing begin...");
            Thread.sleep(3000);
            String workFruit = "["+Thread.currentThread().getName()+"]开始洗苹果。";
            String workVegetables = "["+Thread.currentThread().getName()+"]开始洗西兰花!";
            synchronized (this) {
                fruit = workFruit;
                vegetables = workVegetables;
            }
            System.out.println(fruit);
            System.out.println(vegetables);
            System.out.println("washing end !!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
