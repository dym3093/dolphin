package com.dayton.dolphin.threadInner.chap02.part03;

/**
 * Created by bruce on 17-6-4.
 */
public class DemoPart03 {

    public static void main(String[] args){
        DemoPart03 demo = new DemoPart03();
//        demo.testPrintString();
//        demo.testNotAtomicThread();
        demo.testAddCountThread();
    }

    public void testPrintString(){
        PrintString ps = new PrintString();
        new Thread(ps).start();
        System.out.println("停止执行...");
        ps.setContinuePrint(false);
    }

    public void testNotAtomicThread(){
        NotAtomicThread[] threads = new NotAtomicThread[100];
        for (int i=0; i<100; i++){
            threads[i] = new NotAtomicThread();
        }
        for (int j=0; j<100; j++){
            threads[j].start();
        }
    }

    public void testAddCountThread(){
        AddCountThread addCountThread = new AddCountThread();

        for (int j=0; j<3; j++){
            new Thread(addCountThread).start();
        }
    }
}
