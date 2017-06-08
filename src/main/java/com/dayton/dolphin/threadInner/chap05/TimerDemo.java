package com.dayton.dolphin.threadInner.chap05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by bruce on 17-6-8.
 */
public class TimerDemo {

    public static Timer timer = new Timer(true);

    public static void main(String[] args){
        try {
            MyTask myTask = new MyTask();
            MyTaskTwo myTaskTwo = new MyTaskTwo();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date now = sdf.parse("2017-06-08 22:28:36");
            Date nowTwo = sdf.parse("2017-06-08 22:29:36");
            System.out.println("字符串1时间：" + now.toLocaleString()
                                + " , 当前时间：" + new Date().toLocaleString());
            System.out.println("字符串2时间：" + nowTwo.toLocaleString()
                    + " , 当前时间：" + new Date().toLocaleString());
            timer.schedule(myTask, now);
            timer.schedule(myTaskTwo, nowTwo);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println(" MyTask 开始运行！ 时间："+ new Date());
        }
    }

    public static class MyTaskTwo extends TimerTask{
        @Override
        public void run() {
            System.out.println(" MyTaskTwo 开始运行！ 时间："+ new Date());
        }
    }
}
