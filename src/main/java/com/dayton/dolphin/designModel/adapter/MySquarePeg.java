package com.dayton.dolphin.designModel.adapter;


/**
 * Created by bruce on 17-5-23.
 */
public class MySquarePeg implements ISquarePeg{

    @Override
    public void insert(String msg) {
        System.out.println(this.getClass().getSimpleName()+ " insert(): "+msg);
    }
}
