package com.dayton.dolphin.threadInner.chap03.part02;

/**
 * Created by bruce on 17-6-6.
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在 run end 处打印了！ ");
        } catch (InterruptedException e) {
            System.out.println("线程B在 run catch 处打印了！ ");
            e.printStackTrace();
        }
    }
}
