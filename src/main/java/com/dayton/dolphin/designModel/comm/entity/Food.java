package com.dayton.dolphin.designModel.comm.entity;/**
 * Created by daimian on 17-5-22.
 */

import java.io.Serializable;

/**
 * 食物
 *
 * @author Damian
 * @create 2017-05-22 上午9:53
 **/
public abstract class Food implements Serializable{

    protected String color;

    public Food(String color){
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
