package com.dayton.dolphin.threadCore.crazyJava.threadLocal;/**
 * Created by daimian on 17-5-4.
 */

/**
 * ThreadLocal测试用例
 *
 * @author Damian
 * @create 2017-05-04 上午12:53
 **/
public class ThreadLocalTest {

    public static void main(String[] args){
        MyAccount account = new MyAccount("黄金洁西卡");
        new MyTest(account, "one").start();
        new MyTest(account, "two").start();
    }
}
