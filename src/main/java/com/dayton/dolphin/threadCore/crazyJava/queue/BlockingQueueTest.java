package com.dayton.dolphin.threadCore.crazyJava.queue;
/**
 * Created by daimian on 17-5-3.
 */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 阻塞队列测试
 *
 * @author Damian
 * @create 2017-05-03 下午6:44
 **/
public class BlockingQueueTest {

    public static void main(String[] args){
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);

        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();

        new Consumer(bq).start();
    }

}
