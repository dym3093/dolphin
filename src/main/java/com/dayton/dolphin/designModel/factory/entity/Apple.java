package com.dayton.dolphin.designModel.factory.entity;/**
 * Created by daimian on 17-5-22.
 */

import com.dayton.dolphin.designModel.comm.entity.Fruit;

import java.io.Serializable;

/**
 * 苹果
 *
 * @author Damian
 * @create 2017-05-22 上午9:56
 **/
public class Apple extends Fruit implements Serializable{

    public Apple(){
        System.out.println(this.getClass().getSimpleName()+" created ...");
    }

}
