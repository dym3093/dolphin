package com.dayton.dolphin.threadInner.chap02.part01;

/**
 * Created by bruce on 17-6-3.
 */
public class ObjectLockDemo {

    public static void main(String[] args){
//        testA();
//        testCommVar();
//        testReentryService();
        testMainSubClazz();
    }
    public static void testA(){
        MyObject bike = new MyObject();
        ThreadApple apple = new ThreadApple(bike);
        apple.setName("apple");
        ThreadBag bag = new ThreadBag(bike);
        bag.setName("bag");
        apple.start();
        bag.start();

    }

    public static void testCommVar(){
        try {
            CommVar commVar = new CommVar();
            ThreadCat cat = new ThreadCat(commVar);
            cat.start();
            Thread.sleep(500);
            commVar.getVal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testReentryService(){
        ReentryService service = new ReentryService();
        ThreadService testThread = new ThreadService(service);
        testThread.start();
    }

    public static void testMainSubClazz(){
        SonClazz sonClazz = new SonClazz();
        ThreadMain threadMain = new ThreadMain(sonClazz);
        ThreadMainOther threadMainOther = new ThreadMainOther(sonClazz);
        threadMain.start();
        threadMainOther.start();
    }

}
