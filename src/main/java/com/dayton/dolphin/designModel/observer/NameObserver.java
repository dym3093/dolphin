package com.dayton.dolphin.designModel.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 对产品名称进行观察
 * Created by bruce on 17-5-23.
 */
public class NameObserver implements Observer{

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String){
            this.name = (String) arg;
            System.out.println(this.getClass().getSimpleName()+
                    " : name change to " + name);
        }
    }
}
