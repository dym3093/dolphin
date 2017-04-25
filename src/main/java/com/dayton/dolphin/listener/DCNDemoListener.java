package com.dayton.dolphin.listener;

import oracle.jdbc.dcn.DatabaseChangeEvent;
import oracle.jdbc.dcn.DatabaseChangeListener;

/**
 * Created by damian on 16-12-31.
 */
public class DCNDemoListener implements DatabaseChangeListener {

    DBChangeNotification demo;
    DCNDemoListener(DBChangeNotification dem)
    {
        demo = dem;
    }

    public void onDatabaseChangeNotification(DatabaseChangeEvent e)
    {
        Thread t = Thread.currentThread();
        System.out.println("DCNDemoListener: got an event ("+this+" running on thread "+t+")");
        System.out.println(e.toString());
        synchronized( demo ){ demo.notify();}
    }
}
