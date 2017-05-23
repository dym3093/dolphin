package com.dayton.dolphin.designModel.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 价格监听
 * Created by bruce on 17-5-23.
 */
public class PriceObserver implements Observer{

    private Double price;

    @Override
    public void update(Observable o, Object arg) {
       if (arg instanceof Double){
            price = (Double) arg;
           System.out.println(this.getClass().getSimpleName()+
                   " : price change to " + price);
       }
    }
}
