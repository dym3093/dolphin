package com.dayton.dolphin.threadInner.chap02.part03;

/**
 * Created by bruce on 17-6-4.
 */
public class PrintString implements Runnable{

    private boolean continuePrint = true;

    public void printMethod(){
        try {
            while (continuePrint){
                System.out.println("run printMethod Thread["
                                    +Thread.currentThread().getName()+"]");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean isContinuePrint() {
        return continuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        this.continuePrint = continuePrint;
    }

    @Override
    public void run() {
        printMethod();
    }
}
