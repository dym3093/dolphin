package com.dayton.dolphin.designModel.factory.entity;/**
 * Created by daimian on 17-5-22.
 */

import com.dayton.dolphin.designModel.comm.entity.Fruit;

import java.io.Serializable;

/**
 * 香蕉
 *
 * @author Damian
 * @create 2017-05-22 上午10:12
 **/
public class Banana extends Fruit implements Serializable{

    public Banana(){
        System.out.println(this.getClass().getSimpleName()+" created ...");
    }

}
