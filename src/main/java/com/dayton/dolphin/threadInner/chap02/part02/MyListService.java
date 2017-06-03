package com.dayton.dolphin.threadInner.chap02.part02;

/**
 * Created by bruce on 17-6-3.
 */
public class MyListService {

    public MyList addServiceList(MyList list, String data){
        try {
            synchronized (list){
                if (list.size()<1) {
                    list.add(data);
                    Thread.sleep(100);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
