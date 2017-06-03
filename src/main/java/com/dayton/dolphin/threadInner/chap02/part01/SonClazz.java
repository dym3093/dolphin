package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * Created by bruce on 17-6-3.
 */
public class SonClazz extends FatherClazz{

    public synchronized void buildingSon(){
        try {
            while (num>0) {
                num--;
                System.out.println(this.getClass().getSimpleName()+ " Class, num = " + num);
                Thread.sleep(1000);
                this.buildingFather();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
