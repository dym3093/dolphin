package com.dayton.dolphin.designModel.flyWeight;/**
 * Created by daimian on 17-5-22.
 */

/**
 * FlyWeight测试
 *
 * @author Damian
 * @create 2017-05-22 下午4:41
 **/
public class FlyWeightDemo {

    public static void main(String[] args){
        test();
    }

    public static void test(){
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight one = factory.getFlyWeight("one");
        FlyWeight two = factory.getFlyWeight("two");
        FlyWeight otherOne = factory.getFlyWeight("one");
        System.out.println("hashCode one "+one);
        System.out.println("hashCode two "+two);
        System.out.println("hashCode otherOne "+otherOne);
    }
}
