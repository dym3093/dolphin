package com.dayton.dolphin.designModel.bridge;

/**
 * 大杯
 * Created by bruce on 17-5-22.
 */
public class SuperSizeCoffee extends Coffee{

    public SuperSizeCoffee(){
        setCoffeeImp();
    }

    @Override
    public void pourCoffee() {
        CoffeeImp coffeeImp = this.getCoffeeImp();
        for (int i=0; i<5; i++){
            coffeeImp.pourCoffeeImp();
        }
    }

}
