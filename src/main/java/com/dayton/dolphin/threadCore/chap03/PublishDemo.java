package com.dayton.dolphin.threadCore.chap03;/**
 * Created by daimian on 17-4-21.
 */

import com.dayton.dolphin.threadCore.base.entity.User;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * safe for publish object
 * @author Damian
 * @create 2017-04-21 上午11:23
 **/
public class PublishDemo {
    public static Set<User> userSet;

    public void init(){
        userSet = new HashSet<User>();
    }

    public static void main(String[] args){
        ImmutableStore store = new ImmutableStore();
        store.getBagOfBlueFat().add("book");
        System.out.println("store contains book ? is true ? "+store.isContains("book"));
        ExecutorService service = Executors.newCachedThreadPool();
    }

}
