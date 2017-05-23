package com.dayton.dolphin.designModel.decorator;

/**
 * Created by bruce on 17-5-23.
 */
public class RoundPeg implements Work{

    @Override
    public void insert() {
        System.out.println("打入圆形桩!");
    }

    public void insertIntoHole(String str){
        System.out.println(this.getClass().getSimpleName()+" insertIntoHole() " + str);
    }

}
