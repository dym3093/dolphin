package com.dayton.dolphin.threadInner.chap03.part01;

import java.io.PipedInputStream;

/**
 * Created by bruce on 17-6-5.
 */
public class ReadThread extends Thread{

    private ReadData readData;
    private PipedInputStream inputStream;

    public ReadThread(ReadData readData, PipedInputStream inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.read(inputStream);
    }
}
