package com.dayton.dolphin.threadAction.immutableObject;


/**
 * Created by bruce on 17-6-1.
 */
public class ImmutableDemo {

    public static void main(String[] args){
        testLocation();
    }

    public static void testLocation(){
        Location location = new Location(2.0, 3.2);
        System.out.println("location org \t ");
        System.out.println(location.toString());
    }
}
