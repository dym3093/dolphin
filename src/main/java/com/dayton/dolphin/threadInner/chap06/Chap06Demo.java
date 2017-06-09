package com.dayton.dolphin.threadInner.chap06;

/**
 * Created by bruce on 17-6-8.
 */
public class Chap06Demo {

    public static void main(String[] args){
        Chap06Demo demo = new Chap06Demo();
        demo.testInstance();

    }

    public void testInstance(){
        MyThread one = new MyThread();
        MyThread two = new MyThread();
        MyThread three = new MyThread();
        one.start();
        two.start();
        three.start();
    }
}
