package com.dayton.dolphin.designModel.composite;

/**
 * Created by bruce on 17-5-23.
 */
public class Chassis extends CompositeEquipment{

    public Chassis(String name) {
        super(name);
    }

    public double netPrice(){
        return 1+super.netPrice();
    }

    public double discountPrice(){
        return 0.5+super.discountPrice();
    }

}
