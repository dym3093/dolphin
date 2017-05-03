package com.dayton.dolphin.threadCore.crazyJava.thread;
/**
 * Created by daimian on 17-5-3.
 */

/**
 * 线程组测试
 *
 * @author Damian
 * @create 2017-05-03 下午10:30
 **/
public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    public MyThread(ThreadGroup group, String name){
        super(group, name);
    }

    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("["+getName()+"]线程的变量： "+i);
        }
    }
}

