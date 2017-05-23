package com.dayton.dolphin.designModel.bridge;

/**
 * 无任何添加的行为
 * Created by bruce on 17-5-22.
 */
public class FragrantCoffeeImp extends CoffeeImp{

    public FragrantCoffeeImp() {}

    @Override
    public void pourCoffeeImp() {
        System.out.println("无添加，清香！");
    }

}
