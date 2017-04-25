package com.dayton.dolphin.headFirst.chp4.entity;

import java.util.ArrayList;

/**
 * Created by root on 17-2-6.
 */
public abstract class Pizza {

    private String name;

    private String dough;

    private String sauce;

    private ArrayList toppings = new ArrayList();

    public void prepare(){

    }

    public abstract String bake();

    public abstract String cut();

    public abstract String box();

}
