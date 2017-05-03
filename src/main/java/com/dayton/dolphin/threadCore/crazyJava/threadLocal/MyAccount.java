package com.dayton.dolphin.threadCore.crazyJava.threadLocal;
/**
 * Created by daimian on 17-5-4.
 */

/**
 * ThreadLocal相关的Account
 *
 * @author Damian
 * @create 2017-05-04 上午12:43
 **/
public class MyAccount {

    private ThreadLocal<String> accountNo = new ThreadLocal<String>();

    public MyAccount(String accountNo){
        setAccountNo(accountNo);
    }

    public String getAccountNo() {
        return accountNo.get();
    }

    public void setAccountNo(String accountNo) {
       this.accountNo.set(accountNo);
    }

}
