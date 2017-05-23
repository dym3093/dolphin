package com.dayton.dolphin.designModel.bridge;

/**
 * Created by bruce on 17-5-22.
 */
public class CoffeeImpSingleton {

    private static CoffeeImp coffeeImp;

    public CoffeeImpSingleton(CoffeeImp coffeeImp) {
        this.coffeeImp = coffeeImp;
    }

    public static CoffeeImp getInstance() {
        return coffeeImp;
    }

}
