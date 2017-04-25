package com.dayton.dolphin.threadCore.chap03;/**
 * Created by daimian on 17-4-21.
 */

import org.apache.activemq.advisory.ConsumerEventSource;

import java.awt.*;
import java.util.EventListener;

/**
 * @author Damian
 * @create 2017-04-21 上午11:42
 **/
public class SafeListener {

    private final EventListener listener;

    private SafeListener(){
        listener = new EventListener() {
            public void onEvent(Event e){
                System.out.println("Event name: "+e.toString());
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }

    public static SafeListener newInstance(Event source){
       SafeListener safeListener = new SafeListener();
       return safeListener;
    }

}
