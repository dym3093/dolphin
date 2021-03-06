package com.dayton.dolphin.designModel.singleton;/**
 * Created by daimian on 17-5-22.
 */

/**
 * Enum模式的单例
 *
 * @author Damian
 * @create 2017-05-22 下午1:27
 **/
public enum Singleton {

    INSTANCE;

    Singleton(){
        System.out.println(this.getClass().getSimpleName() + " created ...");
        System.out.println("hashCode: "+this.hashCode());
    }

}
