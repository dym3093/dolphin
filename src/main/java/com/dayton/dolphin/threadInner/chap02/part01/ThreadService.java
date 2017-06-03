package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * Created by bruce on 17-6-3.
 */
public class ThreadService extends Thread{

    private ReentryService service;

    public ThreadService(ReentryService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.showPic();
    }
}
