package com.dayton.dolphin.test.util;
/**
 * Created by admin on 2016/11/28.
 */

import org.apache.commons.lang3.StringUtils;

/**
 * @author YoumingDeng
 * @create 2016-11-28 9:49
 */
public class TestDemo {

    public static void main(String[] args) throws Exception{
        //justingInt();
//        String view_head = "http://img.healthlink.cn:8099/jyReport";
//        String diskNo = "/usr/ymdata/jyReport";
//        String addr = "/usr/ymdata/jyReport/jyDetail/20161205/JY258/TM12/JZ00100763_1.jpg" ;
//        String res = addr.replace(diskNo, view_head);
//        System.out.println("viewPath: "+res);
        splitTests();
        splitTests2();
        String str = "REFERENCEDESC";
    }

    public static void splitTests(){
        String str = "||||||0|8.78||";
        String[] arr = str.split("\\|",-1);
        for (int i=0; i<arr.length; i++){
            System.out.println("["+i+"]: "+(StringUtils.isEmpty(arr[i])?"null str":arr[i]));
        }
        System.out.println("done...");
    }
    public static void splitTests2(){
        String str = "0,8.78,3,st";
        String[] arr = str.split(",");
        for (int i=0; i<arr.length; i++){
            System.out.println("["+i+"]: "+(StringUtils.isEmpty(arr[i])?"null str":arr[i]));
        }
        System.out.println("done...");
    }
    public static void justingInt(){
        Integer a = 1000;
        Integer b = 1000;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println(a==b);
        Integer c = 100;
        Integer d = 100;
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println(c==d);

    }
}

