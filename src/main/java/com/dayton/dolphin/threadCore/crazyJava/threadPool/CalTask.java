package com.dayton.dolphin.threadCore.crazyJava.threadPool;/**
 * Created by daimian on 17-5-3.
 */

import java.util.concurrent.RecursiveTask;

/**
 * 计算累加
 *
 * @author Damian
 * @create 2017-05-03 下午11:50
 **/
public class CalTask extends RecursiveTask<Integer>{

    //每个“任务”最多只累加20个数
    private static final int THRESHOLD = 20;
//    private static int sum = 0;

    private int[] arr;
    private int start;
    private int end;

    public CalTask(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if (end - start < THRESHOLD){
            System.out.println("start["+start+"], end["+end+"]");
            for (int i=start; i<=end; i++){
                System.out.println("arr["+i+"]: "+arr[i]);
                sum += arr[i];
            }
        }else {
            //循环次数
            int times = (end-start)%THRESHOLD==0?(end-start)/THRESHOLD:(end-start)/THRESHOLD+1;
            for (int n=1; n<=times; n++){
                System.out.println("第["+n+"]次循环 start");
                sum +=
                    new CalTask(arr, (n-1)*THRESHOLD, n*THRESHOLD-1).fork().join();
                System.out.println("第["+n+"]次循环 end");
            }
        }
        System.out.println("累加的结果值为： "+sum );
        return sum;
    }
}
