package com.dayton.dolphin.designModel.composite;

/**
 * Created by bruce on 17-5-23.
 */
public class Disk extends Equipment{

    public Disk(String name) {
        super(name);
    }

    @Override
    public double netPrice() {
        return 1.0;
    }

    @Override
    public double discountPrice() {
        return 0.5;
    }

}
