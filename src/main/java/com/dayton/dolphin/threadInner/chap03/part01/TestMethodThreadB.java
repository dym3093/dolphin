package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class TestMethodThreadB extends Thread{

    private Object lock;

    public TestMethodThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }

}
