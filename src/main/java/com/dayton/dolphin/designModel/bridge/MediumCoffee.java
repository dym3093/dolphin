package com.dayton.dolphin.designModel.bridge;

/**
 * 中杯
 * Created by bruce on 17-5-22.
 */
public class MediumCoffee extends Coffee{

    public MediumCoffee() {
        setCoffeeImp();
    }

    @Override
    public void pourCoffee() {
        CoffeeImp coffeeImp = this.getCoffeeImp();
        for (int i=0; i<2; i++){
            coffeeImp.pourCoffeeImp();
        }
    }

}
