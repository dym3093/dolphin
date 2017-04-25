package com.dayton.dolphin.threadCore.chap03;

/**
 * Created by daimian on 17-4-21.
 */

/**
 * Thread No Safe
 *
 * @author Damian
 * @create 2017-04-21 上午10:01
 **/
public class Novisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread{
        int count = 0;
        public void run(){
            while (ready){
                Thread.yield();
                System.out.println("number["+(++count)+"] "+number);
            }
        }
    }

    public static void main(String[] args){
        new ReaderThread().start();
        number = 37;
        ready = true;
    }

}
