package com.dayton.dolphin.threadCore.crazyJava.thread;/**
 * Created by daimian on 17-5-3.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池测试类
 *
 * @author Damian
 * @create 2017-05-03 下午11:21
 **/
public class ThreadPoolTest {

    public static void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(4);
        //线程池执行线程
        pool.submit(new MyThread("盖楼"));
        pool.submit(new MyThread("挖坑"));
        //线程池关闭
        pool.shutdown();
    }
}
