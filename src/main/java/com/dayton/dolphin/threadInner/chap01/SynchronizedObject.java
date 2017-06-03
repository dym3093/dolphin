package com.dayton.dolphin.threadInner.chap01;

/**
 * Created by bruce on 17-6-2.
 */
public class SynchronizedObject {

    private String name = "a";
    private String password = "kk";

    public SynchronizedObject(){}

    synchronized public void printString(String name, String password){
        try {
            this.name = name;
            Thread.sleep(10000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
