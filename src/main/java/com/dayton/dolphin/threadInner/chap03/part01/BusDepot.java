package com.dayton.dolphin.threadInner.chap03.part01;

/**
 * Created by bruce on 17-6-4.
 */
public class BusDepot extends Thread{

    private Object lock;

    public BusDepot(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                if (PassengerList.size() != 5){
                    System.out.println(" wait begin "
                            + System.currentTimeMillis());
                    lock.wait();
                    System.out.println(" wait end "
                            + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
