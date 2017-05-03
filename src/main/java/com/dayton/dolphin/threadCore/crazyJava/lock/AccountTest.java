package com.dayton.dolphin.threadCore.crazyJava.lock;
/**
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

        Account account = new Account("hl", 0);
        new DrawThread("日常花销", account, 700).start();

        new DepositThread("支付宝日收入", account, 1000).start();
        new DepositThread("理财日收入", account, 3000).start();
        new DepositThread("工资日收入", account, 3000).start();

        new DrawThread("慈善捐助", account, 1000).start();


    }

}
