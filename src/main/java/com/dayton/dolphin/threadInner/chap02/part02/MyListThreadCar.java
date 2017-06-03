package com.dayton.dolphin.threadInner.chap02.part02;

/**
 * Created by bruce on 17-6-3.
 */
public class MyListThreadCar extends Thread{

    private MyList myList;

    public MyListThreadCar(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            myList.add(this.getName()+"_"+(i+1));
        }
    }
}
