package com.dayton.dolphin.headFirst.chp4.entity;

import java.util.List;

/**
 * Created by root on 17-2-13.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
