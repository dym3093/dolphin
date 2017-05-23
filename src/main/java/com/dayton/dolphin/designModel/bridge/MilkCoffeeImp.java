package com.dayton.dolphin.designModel.bridge;

/**
 * Created by bruce on 17-5-22.
 */
public class MilkCoffeeImp extends CoffeeImp{

    public MilkCoffeeImp(){}

    @Override
    public void pourCoffeeImp() {
        System.out.println("加了美味的牛奶");
    }

}
