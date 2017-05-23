package com.dayton.dolphin.designModel.adapter;

/**
 * Created by bruce on 17-5-23.
 */
public class MyRoundPeg implements IRoundPeg{

    @Override
    public void insertIntoHole(String msg) {
        System.out.println(this.getClass().getSimpleName()+ " insertIntoHole(): "+msg);
    }

}
