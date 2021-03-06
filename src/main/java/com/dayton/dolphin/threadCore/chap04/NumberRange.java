package com.dayton.dolphin.threadCore.chap04;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by bruce on 17-4-25.
 */
public class NumberRange {
    private final AtomicInteger lower = new AtomicInteger(0);
    private final AtomicInteger upper = new AtomicInteger(0);

    public void setLower(int i){
        synchronized (this){
            if(i>upper.get()){
                throw new IllegalArgumentException("can't set lower to "+i+" > upper");
            }
            lower.set(i);
        }
    }

    public void setUpper(int i){
        if (i<lower.get()){
            throw new IllegalArgumentException("can't set upper to "+i+" < lower");
        }
        lower.set(i);
    }

    public boolean isInRange(int i){
        return (i>=lower.get())&&(i<=upper.get());
    }

}
