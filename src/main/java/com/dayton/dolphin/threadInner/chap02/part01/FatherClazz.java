package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * Created by bruce on 17-6-3.
 */
public class FatherClazz {

    public int num = 10;

    public synchronized void buildingFather(){
        try {
            num --;
            System.out.println(this.getClass().getSimpleName()+" Class, num = "+num);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
