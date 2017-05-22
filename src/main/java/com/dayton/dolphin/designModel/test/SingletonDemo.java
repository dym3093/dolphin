package com.dayton.dolphin.designModel.test;/**
 * Created by daimian on 17-5-22.
 */

import com.dayton.dolphin.designModel.singleton.Singleton;

/**
 * @author Damian
 * @create 2017-05-22 下午1:29
 **/
public class SingletonDemo {

    public static void main(String[] args){
        Singleton singleton = Singleton.INSTANCE;
        System.out.println("singleton "+singleton.hashCode());
        for (int i=0; i<10; i++) {
            System.out.println(Singleton.INSTANCE.hashCode());
        }
    }
}
