package com.dayton.dolphin.threadInner.chap06;

/**
 * 双检锁(DCL Double Check Lock)实现的单例模式
 * Created by bruce on 17-6-8.
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        try {
            if (singleton!=null){
                System.out.println("已经存在该类的实例!");
            } else {
                Thread.sleep(1000);
                synchronized (Singleton.class) {
                    if (singleton == null) {
                        singleton = new Singleton();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }

}
