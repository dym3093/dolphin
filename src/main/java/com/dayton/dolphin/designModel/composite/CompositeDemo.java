package com.dayton.dolphin.designModel.composite;

/**
 * Created by bruce on 17-5-23.
 */
public class CompositeDemo {

    public static void main(String[] args){
        test();
    }

    public static void test(){
        Cabinet cabinet = new Cabinet("Tower");
        Chassis chassis = new Chassis("PC Chassis");
        cabinet.add(chassis);
        chassis.add(new Disk("500 GB"));
        System.out.println("netPrice= "+cabinet.netPrice());
        System.out.println("discountPrice= "+cabinet.discountPrice());
    }

}
