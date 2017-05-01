package com.dayton.dolphin.threadCore.chap05;/**
 * Created by daimian on 17-5-1.
 */

import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * 索引
 *
 * @author Damian
 * @create 2017-05-01 下午9:31
 **/
public class Indexer implements Runnable{
    private final BlockingQueue<File> queue;

    public Indexer(BlockingQueue<File> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

    }

}
