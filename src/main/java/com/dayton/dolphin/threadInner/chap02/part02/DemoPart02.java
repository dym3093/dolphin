package com.dayton.dolphin.threadInner.chap02.part02;

/**
 * Created by bruce on 17-6-3.
 */
public class DemoPart02 {

    public static void main(String[] args){
//        testMyTask();
        testMyService();
    }


    public static void testMyTask(){
        try {
            MyTask myTask = new MyTask();
            WashThreadOne one = new WashThreadOne(myTask);
            WashThreadTwo two = new WashThreadTwo(myTask);
            one.start();
            two.start();
            Thread.sleep(10000);
            long beginTime = CommUtils.startTime <= CommUtils.beginTime
                        ? CommUtils.startTime : CommUtils.beginTime;
            long endTime = CommUtils.stopTime >= CommUtils.endTime
                        ? CommUtils.stopTime : CommUtils.endTime;
            System.out.println("总共耗时： " + (endTime-beginTime)/1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testMyService(){
        MyService myService = new MyService();
        MyServiceThread doom = new MyServiceThread(myService);
        doom.setName("Crazy");
        MyServiceThreadOne one = new MyServiceThreadOne(myService);
        one.setName("One");
        doom.start();
        one.start();
    }

}
