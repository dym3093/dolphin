package com.dayton.dolphin.threadInner.chap03.part01;



/**
 * Created by bruce on 17-6-4.
 */
public class DemoPart01 {

    public static void main(String[] args){
        DemoPart01 demo = new DemoPart01();
//        demo.test1();
//        demo.testWaitBus();
//        demo.testBusManager();
//        demo.testService();
//        demo.testServiceTwo();
        demo.testProduceAndConsume();
    }
    public void test1(){
        try {
            String str = new String();
            synchronized (str){
                System.out.println("第一行");
                str.wait();
                System.out.println("结束了");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void testWaitBus(){
        try {
            Object bus = new String("bus");
            WaitBus waitBus = new WaitBus(bus);
            waitBus.start();
            Thread.sleep(5000);
            BusInfo busInfo = new BusInfo(bus);
            busInfo.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void testBusManager(){
        try {
            Object bus = new String("Kat");
            BusDepot depot = new BusDepot(bus);
            depot.start();
                Thread.sleep(500);
            BusManager manager = new BusManager(bus);
            manager.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void testService(){
        Object lock = new Object();
        TestMethodThread testMethodThread = new TestMethodThread(lock);
        testMethodThread.setName("A");
        testMethodThread.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.setName("B");
        notifyThread.start();
        SynNotifyMethodThread synNotifyMethodThread =
                new SynNotifyMethodThread(lock);
        synNotifyMethodThread.setName("C");
        synNotifyMethodThread.start();
    }

    public void testServiceTwo(){
        Object lock = new Object();
        TestMethodThread a = new TestMethodThread(lock);
        a.setName("A");
        a.start();
        TestMethodThreadB b = new TestMethodThreadB(lock);
        b.setName("B");
        b.start();
        TestMethodThreadC c = new TestMethodThreadC(lock);
        c.setName("C");
        c.start();
        NotifyThreadOther notifyThreadOther = new NotifyThreadOther(lock);
        notifyThreadOther.setName("D");
        notifyThreadOther.start();

    }

    public void testProduceAndConsume(){
        String lock = new String("lock");

        Producer producer = new Producer(lock);
        ProduceThread produceThread = new ProduceThread(producer);
        produceThread.setName("producer");
        produceThread.start();

        Consumer consumer = new Consumer(lock);
        ConsumeThread consumeThread = new ConsumeThread(consumer);
        consumeThread.setName("consumer");
        consumeThread.start();

    }
}
