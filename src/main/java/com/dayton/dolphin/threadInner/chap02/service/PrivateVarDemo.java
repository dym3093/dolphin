package com.dayton.dolphin.threadInner.chap02.service;

/**
 * Created by bruce on 17-6-3.
 */
public class PrivateVarDemo {

    public static void main(String[] args){

        testPrivateVar();
    }

    public static void testPrivateVar(){
        HasSelfPrivateNum privateNum = new HasSelfPrivateNum();
        HasSelfPrivateNum privateNum2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(privateNum);
        ThreadB threadB = new ThreadB(privateNum2);
        threadA.start();
        threadB.start();
    }
}
