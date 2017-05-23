package com.dayton.dolphin.designModel.singleton;/**
 * Created by daimian on 17-5-22.
 */

/**
 * 静态内部类写法(常用)
 *
 * @author Damian
 * @create 2017-05-22 下午2:44
 **/
public class SingletonInner {

    private static class SingletonHolder{
        private static final SingletonInner INSTANCE = new SingletonInner();
    }

    private SingletonInner(){
        System.out.println(this.getClass().getSimpleName()+" created ... ");
        System.out.println("hashCode: "+this.hashCode());
    }

    public static SingletonInner getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
