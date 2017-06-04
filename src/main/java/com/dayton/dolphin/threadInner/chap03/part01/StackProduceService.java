package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * 生产服务
 * Created by bruce on 17-6-4.
 */
public class StackProduceService {

    private MyStack stack;

    public StackProduceService(MyStack stack) {
        this.stack = stack;
    }

    public void pushService(){
        stack.push();
    }

}
