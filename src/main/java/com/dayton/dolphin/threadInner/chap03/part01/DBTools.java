package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-5.
 */
public class DBTools {

    private volatile boolean prevIsA = false;

    public synchronized void backupA(){
        try {
            while (prevIsA){
                System.out.println("Thread["+Thread.currentThread().getName()+"]"
                        +" backupA wait ...");
                    wait();
            }
            for (int i=0; i<5; i++){
                System.out.println(" ***** ");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void backupB(){
        try {
            while (!prevIsA){
                wait();
            }
            for (int i=0; i<5; i++){
                System.out.println(" ##### ");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
