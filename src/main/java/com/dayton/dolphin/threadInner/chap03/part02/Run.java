package com.dayton.dolphin.threadInner.chap03.part02;

/**
 * Created by bruce on 17-6-7.
 */
public class Run {
    public static ThreadLocal<String> local = new ThreadLocal<>();

    public static void main(String[] args){
        if (local.get()==null){
            System.out.println("从未放入值");
            local.set("MyValue");
        }
        System.out.println(local.get());
        System.out.println(local.get());
    }
}
