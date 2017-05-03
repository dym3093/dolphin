package com.dayton.dolphin.threadCore.crazyJava.thread;/**
 * Created by daimian on 17-5-3.
 */

/**
 * 线程组测试类
 *
 * @author Damian
 * @create 2017-05-03 下午10:43
 **/
public class ThreadGroupTest {

    public static void main(String[] args){
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        System.out.println("主线程组的名字： "+ mainGroup.getName());
        System.out.println("主线程组是否是后台线程组：" + mainGroup.isDaemon());

        new MyThread("主线程组的线程").start();

        ThreadGroup tg = new ThreadGroup("新线程组");
        tg.setDaemon(true);
        System.out.println("tg线程组是否是后台线程组：" + tg.isDaemon());
        new MyThread(tg, "tg组的线程甲").start();
        new MyThread(tg, "tg组的线程乙").start();

    }
}
