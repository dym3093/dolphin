package com.dayton.dolphin.threadInner.chap02.part02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruce on 17-6-3.
 */
public class MyList {

    private List<String> list = new ArrayList<>();

    public synchronized void add(String name){
        System.out.println("线程["+Thread.currentThread().getName()+"]执行add方法...");
        list.add(name);
        System.out.println("线程["+Thread.currentThread().getName()+"]退出add方法!!!");
    }

    public synchronized int size(){
        System.out.println("线程["+Thread.currentThread().getName()+"]执行size方法...");
        int size = list.size();
        System.out.println("线程["+Thread.currentThread().getName()+"]退出size方法!!!");
        return size;
    }
}
