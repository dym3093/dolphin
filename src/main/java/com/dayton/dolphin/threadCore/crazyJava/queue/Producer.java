package com.dayton.dolphin.threadCore.crazyJava.queue;
/**
 * Created by daimian on 17-5-3.
 */

import java.util.concurrent.BlockingQueue;

/**
 * 生产者
 *
 * @author Damian
 * @create 2017-05-03 下午7:33
 **/
public class Producer extends Thread{

    private BlockingQueue<String> blockingQueue;

    public Producer(BlockingQueue<String> blockingQueue){
        setBlockingQueue(blockingQueue);
    }

    public void run(){
        String[] strArr = new String[]{"java", "ajax", "css"};

        for (int i=0; i<99999999; i++){
            System.out.println("["+getName()+"]生产者准备生产集合元素！");
            try {
                Thread.sleep(200);
                blockingQueue.put(strArr[i%3]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("["+getName()+"]生产完成！");
    }

    public BlockingQueue<String> getBlockingQueue() {
        return blockingQueue;
    }

    public void setBlockingQueue(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

}
