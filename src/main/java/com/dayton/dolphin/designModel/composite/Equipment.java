package com.dayton.dolphin.designModel.composite;

import java.util.Iterator;

/**
 * Created by bruce on 17-5-23.
 */
public abstract class Equipment {

    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    //实价
    public abstract double netPrice();

    //折扣价格
    public abstract double discountPrice();

    //增加部件的方法
    public boolean add(Equipment equipment){
        return false;
    }

    //删除部件
    public boolean remove(Equipment equipment){
        return false;
    }

    //提供访问组合体类部件的方法
    public Iterator iter(){
        return null;
    }

}
