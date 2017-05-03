package com.dayton.dolphin.threadCore.crazyJava.threadLocal;/**
 * Created by daimian on 17-5-4.
 */

/**
 * 测试类
 *
 * @author Damian
 * @create 2017-05-04 上午12:50
 **/
public class MyTest extends Thread{

    private MyAccount account;

    public MyTest(MyAccount account, String name){
        super(name);
        this.account = account;
    }

    public void run(){
        for (int i=0; i<10; i++){
            if (i==6){
                account.setAccountNo(getName());
            }
            System.out.println(account.getAccountNo()+"账户的i值: "+i);
        }
    }

}
