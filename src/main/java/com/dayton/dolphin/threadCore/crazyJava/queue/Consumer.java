package com.dayton.dolphin.threadCore.crazyJava.queue;/**
 * Created by daimian on 17-5-3.
 */

import java.util.concurrent.BlockingQueue;

/**
 * 消费者线程
 *
 * @author Damian
 * @create 2017-05-03 下午9:26
 **/
public class Consumer extends Thread{

    private BlockingQueue<String> blockingQueue;

    public Consumer(BlockingQueue<String> blockingQueue){
        setBlockingQueue(blockingQueue);
    }

    public void run(){
        while (true){
            System.out.println("["+getName()+"] 消费者准备消费集合元素！");
            try {
                Thread.sleep(200);
                blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("["+getName()+"] 消费完成: "+blockingQueue);
        }
    }

    public BlockingQueue<String> getBlockingQueue() {
        return blockingQueue;
    }

    public void setBlockingQueue(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
}
