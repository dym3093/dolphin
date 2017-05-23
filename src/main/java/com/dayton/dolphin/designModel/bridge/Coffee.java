package com.dayton.dolphin.designModel.bridge;/**
 * Created by daimian on 17-5-22.
 */

/**
 * 咖啡
 *
 * @author Damian
 * @create 2017-05-22 下午5:59
 **/
public abstract class Coffee {

    CoffeeImp coffeeImp;

    public abstract void pourCoffee();

    public void setCoffeeImp(){
        this.coffeeImp = CoffeeImpSingleton.getInstance();
    }

    public CoffeeImp getCoffeeImp() {
        return this.coffeeImp;
    }

}
