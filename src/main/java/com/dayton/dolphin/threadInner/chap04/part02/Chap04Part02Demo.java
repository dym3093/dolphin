package com.dayton.dolphin.threadInner.chap04.part02;

/**
 * Created by bruce on 17-6-8.
 */
public class Chap04Part02Demo {

    public static void main(String[] args){
        Chap04Part02Demo demo = new Chap04Part02Demo();
        demo.readAndRead();
    }

    public void readAndRead(){
        RWService service = new RWService();
        ReadThreadOne readOne = new ReadThreadOne(service);
        readOne.setName("one");
        ReadThreadTwo readTwo = new ReadThreadTwo(service);
        readTwo.setName("two");
        readOne.start();
        readTwo.start();
    }

}
