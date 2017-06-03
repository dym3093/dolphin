package com.dayton.dolphin.threadInner.chap02.service;

/**
 * Created by bruce on 17-6-3.
 */
public class HasSelfPrivateNum {

    // eg. num变成实例变量时存在非线程安全的问题
    private int num;

    // 方法加上 synchronized 关键字实现同步，避免非线程安全
    public synchronized void addI(String username){
        try {
            // eg. num为方法内部私有变量，线程安全
//            int num;
            if ("a".equals(username)){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username+" set num = "+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
