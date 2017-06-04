package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class SynNotifyMethodThread extends Thread{

    private Object lock;

    public SynNotifyMethodThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.syncNotNoitfyMethod(lock);
    }
}
