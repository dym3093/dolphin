package com.dayton.dolphin.designModel.decorator;

/**
 * Created by bruce on 17-5-23.
 */
public class DecoratorDemo {

    public static void main(String[] args){
        SquarePeg peg = new SquarePeg();
        Decorator decorator = new Decorator(peg);
        decorator.insert();
    }

}
