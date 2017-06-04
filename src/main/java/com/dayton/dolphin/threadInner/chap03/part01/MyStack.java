package com.dayton.dolphin.threadInner.chap03.part01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruce on 17-6-4.
 */
public class MyStack {

    private List<String> list = new ArrayList<>();

    public synchronized void push(){
        try {
            while (list.size()==1){
                System.out.println("Thread["+Thread.currentThread().getName()+"]"
                                + " push 操作 waiting ...");
                this.wait();
            }
            double ran = Math.random();
            System.out.println("ran = "+ran);
            list.add("anything="+ran);
            this.notifyAll();
            System.out.println("Thread["+Thread.currentThread().getName()+"]"
                    + " push 操作 notifyAll ...");
            System.out.println("push = "+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized String pop(){
        String rest = "";
        try {
            while (list.size() == 0){
                System.out.println("Thread["+Thread.currentThread().getName()+"]"
                        + " pop 操作 wait ...");
                this.wait();
            }
            rest = "" + list.get(0);
            System.out.println("Thread["+Thread.currentThread().getName()
                    +"] , rest = " + rest);
            list.remove(0);
            this.notifyAll();
            System.out.println("Thread["+Thread.currentThread().getName()
                    + "], pop 操作 notifyAll ...");
            System.out.println(" pop = "+list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rest;
    }

}
