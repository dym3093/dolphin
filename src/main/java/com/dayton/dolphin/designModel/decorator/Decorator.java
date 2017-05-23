package com.dayton.dolphin.designModel.decorator;

import java.util.ArrayList;

/**
 * Created by bruce on 17-5-23.
 */
public class Decorator implements Work{

    private Work work;

    //额外增加的功能被打包到List中
    private ArrayList<String> others = new ArrayList<>();

    public Decorator(Work work) {
        this.work = work;
        others.add("挖坑");
        others.add("钉木板");
    }

    public void otherMethod(){
        for (String action : others){
            System.out.println(action+" 正在进行... ");
        }
    }

    public void newMethod(){
        otherMethod();
        work.insert();
    }

    @Override
    public void insert() {
        newMethod();
    }

}
