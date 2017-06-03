package com.dayton.dolphin.threadInner.chap02.part02;

/**
 * synchronized(非this对象) 示例
 * Created by bruce on 17-6-3.
 */
public class MyService {

    private String username;
    private String password;
    // 对象监视器为同一个对象，可以实现同步
    private String anyString = new String();

    public void setParam(String username, String password){
        try {
            //方法的私有变量，不是同一对象，无法实现同步
//            String anyString = new String();
            synchronized (anyString){
                System.out.println("线程["+Thread.currentThread().getName()+"]"
                        +"在"+System.currentTimeMillis()+"进入同步代码块......");
                this.username = username;
                Thread.sleep(3000);
                this.password = password;
                System.out.println(this.toString());
                System.out.println("线程["+Thread.currentThread().getName()+"]"
                        +"在"+System.currentTimeMillis()+"离开同步代码块#######");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MyService[username="+this.username+",passwod="+password+"]";
    }
}
