package com.dayton.dolphin.threadInner.chap03.part01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruce on 17-6-4.
 */
public class PassengerList {

    private static List<String> list = new ArrayList<>();

    public static void add(){
        list.add("anyOne");
    }

    public static int size(){
        return list.size();
    }
}
