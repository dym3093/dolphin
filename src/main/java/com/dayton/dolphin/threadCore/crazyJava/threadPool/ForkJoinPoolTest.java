package com.dayton.dolphin.threadCore.crazyJava.threadPool;/**
 * Created by daimian on 17-5-3.
 */

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 多任务分段测试
 *
 * @author Damian
 * @create 2017-05-03 下午11:46
 **/
public class ForkJoinPoolTest {

    public static void main(String[] args){
        try {
            test2();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void test1(){
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(new PrintTask(0, 300));
        try {
            pool.awaitTermination(2, TimeUnit.SECONDS);
            pool.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void test2() throws ExecutionException, InterruptedException {
        int[] arr = new int[100];
        Random random = new Random();
        int total = 0;
        for (int i=0, len=arr.length; i<len; i++){
            int tmp = random.nextInt(100);
//            System.out.println("tmp["+i+"]： "+tmp);
            total += (arr[i]=tmp);
        }
        System.out.println("总和 total： "+total);

        ForkJoinPool pool = new ForkJoinPool();
        Future<Integer> future = pool.submit(new CalTask(arr, 0, arr.length));
        System.out.println("线程池执行的总和 sum: "+future.get());
        pool.shutdown();
        if (total==future.get()){
            System.out.println("线程池执行结果正确！");
        }else {
            System.out.println("线程池执行结果错误！！！");
        }
    }
}
