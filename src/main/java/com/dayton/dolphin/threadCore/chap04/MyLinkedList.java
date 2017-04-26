package com.dayton.dolphin.threadCore.chap04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 客户端加锁，可实现线程安全，但是破坏封装性
 * Created by bruce on 17-4-26.
 */
public class MyLinkedList<E>{

    private List<E> list = Collections.synchronizedList(new ArrayList<E>());

    public MyLinkedList(List<E> list){
        this.list = Collections.synchronizedList(list);
    }

    public boolean addIfNoContains(E obj){
        synchronized (list) {
            boolean flag = !list.contains(obj);
            if (flag) {
                flag = list.add(obj);
            }
            return flag;
        }
    }
}
