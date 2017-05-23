package com.dayton.dolphin.designModel.decorator;

/**
 * Created by bruce on 17-5-23.
 */
public class SquarePeg implements Work{

    @Override
    public void insert() {
        System.out.println("方型桩插入！");
    }

    public void insert(String str){
        System.out.println(this.getClass().getSimpleName()+" insert() " + str);
    }

}
