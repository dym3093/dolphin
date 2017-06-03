package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * 可重入锁服务
 * Created by bruce on 17-6-3.
 */
public class ReentryService {

    public synchronized void showPic(){
        System.out.println("method showPic");
        playMusic();
    }

    public synchronized void playMusic(){
        System.out.println("method playMusic");
        cooking();
    }

    public synchronized void cooking(){
        System.out.println("method cooking");
    }
}
