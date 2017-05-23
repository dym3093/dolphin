package com.dayton.dolphin.designModel.decorator;

/**
 * Created by bruce on 17-5-23.
 */
public class SquarePeg implements Work{

    @Override
    public void insert() {
        System.out.println("方型桩插入！");
    }

}
