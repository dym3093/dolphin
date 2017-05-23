package com.dayton.dolphin.designModel.composite;

/**
 * Created by bruce on 17-5-23.
 */
public class Cabinet extends CompositeEquipment{

    public Cabinet(String name) {
        super(name);
    }

    public double netPrice(){
        return 2+super.netPrice();
    }

    public double discountPrice(){
        return 1.5+super.discountPrice();
    }
}
