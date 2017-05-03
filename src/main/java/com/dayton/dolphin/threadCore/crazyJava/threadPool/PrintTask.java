package com.dayton.dolphin.threadCore.crazyJava.threadPool;/**
 * Created by daimian on 17-5-3.
 */

import java.util.concurrent.RecursiveAction;

/**
 * 打印任务的线程
 *
 * @author Damian
 * @create 2017-05-03 下午11:37
 **/
public class PrintTask extends RecursiveAction{
    private static final int THRESHOLD = 50;
    private int start;
    private int end;

    //打印从start到end的任务
    public PrintTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end-start < THRESHOLD){
            for (int i=start; i<end; i++){
                System.out.println(Thread.currentThread().getName()+"的i值["+i+"]");
            }
        } else {
            int middle = (start+end)/2;
            PrintTask one = new PrintTask(start, middle);
            PrintTask two = new PrintTask(middle, end);
            one.fork();
            two.fork();
        }
    }
}
