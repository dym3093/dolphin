package com.dayton.dolphin.threadInner.chap03.part01;

import java.io.PipedOutputStream;

/**
 * Created by bruce on 17-6-5.
 */
public class WriteThread extends Thread{

    private WriteData writeData;
    private PipedOutputStream outputStream;

    public WriteThread(WriteData writeData, PipedOutputStream outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        writeData.write(outputStream);
    }
}
