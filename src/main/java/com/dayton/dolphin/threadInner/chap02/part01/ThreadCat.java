package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * Created by bruce on 17-6-3.
 */
public class ThreadCat extends Thread{

    private CommVar commVar;

    public ThreadCat(CommVar commVar) {
        this.commVar = commVar;
    }

    @Override
    public void run() {
        commVar.setVal("cat", "superCat");
    }

}
