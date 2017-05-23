package com.dayton.dolphin.designModel.observer;

/**
 * Created by bruce on 17-5-23.
 */
public class ObserverDemo {

    public static void main(String[] args){
        test();
    }

    public static void test(){
        Product product = new Product();
        product.addObserver(new NameObserver());
        product.addObserver(new PriceObserver());
        product.setName("苹果");
        product.setPrice(12.00);
    }
}
