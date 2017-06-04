package com.dayton.dolphin.threadInner.chap03.part01;


import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

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
//        demo.testProduceAndConsume();
//        demo.testPAndCTwo();
//        demo.testStackService();
//        demo.testStackServiceOther();
//        demo.testManyProducerToOneConsumer();
//        demo.testPipedData();
        demo.testDBTools();
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

    public void testPAndCTwo(){
        String lock = new String("lock");

        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        ProduceThread[] pThreads = new ProduceThread[2];
        ConsumeThread[] cThreads = new ConsumeThread[2];

        for (int i=0; i<2; i++){
            pThreads[i] = new ProduceThread(producer);
            pThreads[i].setName("生产者["+(i+1)+"]");
            cThreads[i] = new ConsumeThread(consumer);
            cThreads[i].setName("消费者["+(i+1)+"]");
            pThreads[i].start();
            cThreads[i].start();
        }

    }

    public void testStackService(){
        MyStack stack = new MyStack();
        StackProduceService produceService = new StackProduceService(stack);
        StackConsumeService consumeService = new StackConsumeService(stack);
        StackProduceServiceThread produceServiceThread = new StackProduceServiceThread(produceService);
        produceServiceThread.setName("生产者");
        StackConsumeServiceThread consumeServiceThread = new StackConsumeServiceThread(consumeService);
        consumeServiceThread.setName("消费者");
        produceServiceThread.start();
        consumeServiceThread.start();
    }

    /**
     * 一个生产者，多个消费者
     */
    public void testStackServiceOther(){
        MyStack stack = new MyStack();
        StackProduceService produceService = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread = new StackProduceServiceThread(produceService);
        produceServiceThread.setName("生产者");

        StackConsumeService consumeService = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread = new StackConsumeServiceThread(consumeService);
        consumeServiceThread.setName("消费者");

        StackConsumeService consumeService_01 = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread_01 = new StackConsumeServiceThread(consumeService_01);
        consumeServiceThread_01.setName("消费者_01");

        StackConsumeService consumeService_02 = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread_02 = new StackConsumeServiceThread(consumeService_02);
        consumeServiceThread_02.setName("消费者_02");

        StackConsumeService consumeService_03 = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread_03 = new StackConsumeServiceThread(consumeService_03);
        consumeServiceThread_03.setName("消费者_03");

        StackConsumeService consumeService_04 = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread_04 = new StackConsumeServiceThread(consumeService_04);
        consumeServiceThread_04.setName("消费者_04");

        produceServiceThread.start();

        consumeServiceThread.start();
        consumeServiceThread_01.start();
        consumeServiceThread_02.start();
        consumeServiceThread_03.start();
        consumeServiceThread_04.start();

    }

    /**
     * 多生产者与一消费者模式
     */
    public void testManyProducerToOneConsumer(){
        MyStack stack = new MyStack();

        StackProduceService produceService = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread = new StackProduceServiceThread(produceService);
        produceServiceThread.setName("生产者");

        StackProduceService produceService_01 = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread_01 = new StackProduceServiceThread(produceService_01);
        produceServiceThread_01.setName("生产者_01");

        StackProduceService produceService_02 = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread_02 = new StackProduceServiceThread(produceService_02);
        produceServiceThread_02.setName("生产者_02");

        StackProduceService produceService_03 = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread_03 = new StackProduceServiceThread(produceService_03);
        produceServiceThread_03.setName("生产者_03");

        StackProduceService produceService_04 = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread_04 = new StackProduceServiceThread(produceService_04);
        produceServiceThread_04.setName("生产者_04");

        StackConsumeService consumeService = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread = new StackConsumeServiceThread(consumeService);
        consumeServiceThread.setName("消费者");

        produceServiceThread.start();
        produceServiceThread_01.start();
        produceServiceThread_02.start();
        produceServiceThread_03.start();
        produceServiceThread_04.start();

        consumeServiceThread.start();
    }

    /**
     * 多生产者对应多消费者模式
     */
    public void testManyProduceToManyConsume(){
        MyStack stack = new MyStack();

        StackProduceService produceService = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread = new StackProduceServiceThread(produceService);
        produceServiceThread.setName("生产者");

        StackProduceService produceService_01 = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread_01 = new StackProduceServiceThread(produceService_01);
        produceServiceThread_01.setName("生产者_01");

        StackProduceService produceService_02 = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread_02 = new StackProduceServiceThread(produceService_02);
        produceServiceThread_02.setName("生产者_02");

        StackProduceService produceService_03 = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread_03 = new StackProduceServiceThread(produceService_03);
        produceServiceThread_03.setName("生产者_03");

        StackProduceService produceService_04 = new StackProduceService(stack);
        StackProduceServiceThread produceServiceThread_04 = new StackProduceServiceThread(produceService_04);
        produceServiceThread_04.setName("生产者_04");

        StackConsumeService consumeService = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread = new StackConsumeServiceThread(consumeService);
        consumeServiceThread.setName("消费者");

        StackConsumeService consumeService_01 = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread_01 = new StackConsumeServiceThread(consumeService_01);
        consumeServiceThread_01.setName("消费者_01");

        StackConsumeService consumeService_02 = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread_02 = new StackConsumeServiceThread(consumeService_02);
        consumeServiceThread_02.setName("消费者_02");

        StackConsumeService consumeService_03 = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread_03 = new StackConsumeServiceThread(consumeService_03);
        consumeServiceThread_03.setName("消费者_03");

        StackConsumeService consumeService_04 = new StackConsumeService(stack);
        StackConsumeServiceThread consumeServiceThread_04 = new StackConsumeServiceThread(consumeService_04);
        consumeServiceThread_04.setName("消费者_04");

        produceServiceThread.start();
        produceServiceThread_01.start();
        produceServiceThread_02.start();
        produceServiceThread_03.start();
        produceServiceThread_04.start();

        consumeServiceThread.start();
        consumeServiceThread_01.start();
        consumeServiceThread_02.start();
        consumeServiceThread_03.start();
        consumeServiceThread_04.start();
    }

    /**
     * 管道命令读写数据
     */
    public void testPipedData(){
        try {
            WriteData writeData = new WriteData();
            PipedOutputStream outputStream = new PipedOutputStream();
            WriteThread writeThread = new WriteThread(writeData, outputStream);
            writeThread.setName(" write ");

            ReadData readData = new ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            ReadThread readThread = new ReadThread(readData, inputStream);
            readThread.setName(" read ");

            outputStream.connect(inputStream);

            readThread.start();
            Thread.sleep(2000);

            writeThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void testDBTools(){
        DBTools tools = new DBTools();
        for (int i=0; i<20; i++) {
            BackupAThread aThread = new BackupAThread(tools);
            BackupBThread bThread = new BackupBThread(tools);
            aThread.start();
            bThread.start();
        }

    }
}
