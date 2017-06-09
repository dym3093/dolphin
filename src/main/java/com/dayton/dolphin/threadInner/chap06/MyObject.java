package com.dayton.dolphin.threadInner.chap06;

import java.io.Serializable;

/**
 * 内部类方法实现单例
 * Created by bruce on 17-6-8.
 */
public class MyObject implements Serializable{

    private static class Holder{
        private static final MyObject INSTANCE = new MyObject();
    }

    private MyObject(){}

    public static MyObject getInstance(){
        return Holder.INSTANCE;
    }
}
