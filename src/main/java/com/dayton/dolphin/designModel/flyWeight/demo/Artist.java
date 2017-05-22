package com.dayton.dolphin.designModel.flyWeight.demo;/**
 * Created by daimian on 17-5-22.
 */


/**
 * 制作人信息
 *
 * @author Damian
 * @create 2017-05-22 下午5:04
 **/
public class Artist {

    private String name;

    public Artist(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
