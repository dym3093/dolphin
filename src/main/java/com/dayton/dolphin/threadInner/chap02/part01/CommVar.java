package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * Created by bruce on 17-6-3.
 */
public class CommVar {
    public String username = "Jhon";
    public String password = "abc";

    public synchronized void setVal(String username, String password){
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println(" method setVal Thread Name : "
                                + Thread.currentThread().getName()
                                + " , var username = "+ this.username
                                + " , var password = "+ this.password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void getVal(){
        System.out.println(" method getVal Thread Name : "
                + Thread.currentThread().getName()
                + " , var username = "+ this.username
                + " , var password = "+ this.password);
    }

}
