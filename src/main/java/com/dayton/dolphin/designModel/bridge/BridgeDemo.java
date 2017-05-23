package com.dayton.dolphin.designModel.bridge;

/**
 * 测试类
 * Created by bruce on 17-5-22.
 */
public class BridgeDemo {

    public static void main(String[] args){
//        test1();
        test2();
    }

    public static void test1(){
        CoffeeImpSingleton singleton = new CoffeeImpSingleton(new MilkCoffeeImp());
        MediumCoffee mediumCoffee = new MediumCoffee();
        mediumCoffee.pourCoffee();
    }

    public static void test2(){
        CoffeeImpSingleton singleton = new CoffeeImpSingleton(new MilkCoffeeImp());
        SuperSizeCoffee superSizeCoffee = new SuperSizeCoffee();
        superSizeCoffee.pourCoffee();
    }

}
