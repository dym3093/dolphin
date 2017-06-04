package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-5.
 */
public class BackupBThread extends Thread{

    private DBTools tools;

    public BackupBThread(DBTools tools) {
        this.tools = tools;
    }

    @Override
    public void run() {
        tools.backupB();
    }
}
