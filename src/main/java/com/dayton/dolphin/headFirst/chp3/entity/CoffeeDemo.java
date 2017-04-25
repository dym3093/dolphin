package com.dayton.dolphin.headFirst.chp3.entity;

/**
 * Created by root on 17-1-27.
 */
public class CoffeeDemo {

    public static void main(String[] args){
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()
                + " $ "+espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);

        System.out.println(darkRoast.getDescription()
                + " $ "+darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);

        System.out.println(houseBlend.getDescription()
                + " $ "+houseBlend.cost());
    }
}
