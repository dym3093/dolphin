package com.dayton.dolphin.threadCore.crazyJava;/**
 * Created by daimian on 17-5-2.
 */

/**
 * 银行账号测试
 *
 * @author Damian
 * @create 2017-05-02 下午9:01
 **/
public class AccountTest {

    public static void main(String[] args){
        Account account = new Account("hl", 1000);
        DrawThread oneThread = new DrawThread("one", account, 700);
        DrawThread twoThread = new DrawThread("two", account, 800);

        oneThread.start();
        twoThread.start();

    }

}
