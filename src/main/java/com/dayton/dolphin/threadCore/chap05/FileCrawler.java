package com.dayton.dolphin.threadCore.chap05;/**
 * Created by daimian on 17-5-1.
 */

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;

/**
 * 文件搜索
 *
 * @author Damian
 * @create 2017-05-01 下午8:41
 **/
public class FileCrawler implements Runnable{
    private final BlockingQueue<File> fileQueue;
    private final FileFilter fileFilter;
    private final File root;

    public FileCrawler(BlockingQueue<File> fileQueue, FileFilter fileFilter, File root) {
        this.fileQueue = fileQueue;
        this.fileFilter = fileFilter;
        this.root = root;
    }

    @Override
    public void run() {
        crawl(root);
    }

    private void crawl(File root){
        File[] files = root.listFiles(fileFilter);
        if (files!=null&&files.length>0){
            for (File file:files){
                if (file.isDirectory()){
                    crawl(file);
                }else if(file!=null){
                    fileQueue.add(file);
                }
            }
        }
    }
}
