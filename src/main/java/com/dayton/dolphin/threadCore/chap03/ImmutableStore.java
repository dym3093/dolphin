package com.dayton.dolphin.threadCore.chap03;/**
 * Created by daimian on 17-4-21.
 */

import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Damian
 * @create 2017-04-21 下午3:19
 **/
public final class ImmutableStore {

    private final Set<String> bagOfBlueFat = new HashSet<String>();

    public static void main(String[] args){
        ImmutableStore store = new ImmutableStore();
//        store.bagOfBlueFat.add("book");
        store.getBagOfBlueFat().add("book");
        System.out.println("store contains book ? is true? "+store.isContains("book"));
        Calendar calendar = Calendar.getInstance();
        ConcurrentHashMap map = new ConcurrentHashMap();
        Collections.unmodifiableMap(map);
    }

    public ImmutableStore(){
        bagOfBlueFat.add("apple");
        bagOfBlueFat.add("house");
        bagOfBlueFat.add("ship");
    }

    public boolean isContains(String someThing){
        return bagOfBlueFat.contains(someThing);
    }

    public synchronized Set<String> getBagOfBlueFat() {
        return new HashSet<String>(bagOfBlueFat);
    }

}
