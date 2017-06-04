package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class StackConsumeService {

    private MyStack stack;

    public StackConsumeService(MyStack stack) {
        this.stack = stack;
    }

    public void cunsumeService(){
        stack.pop();
    }
}
