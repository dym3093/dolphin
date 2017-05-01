package com.dayton.dolphin.threadCore.crazyJava;/**
 * Created by daimian on 17-5-1.
 */

/**
 * 账号相关信息
 *
 * @author Damian
 * @create 2017-05-01 下午10:57
 **/
public class Account {

    //账号
    private String accountNo;
    //余额
    private double balance;

    public Account(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode(){
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }
        if (!(obj instanceof Account)){
            return false;
        }
        if (obj == this){
            return true;
        }
        Account target = (Account) obj;
        return target.accountNo.equals(this.getAccountNo())&&target.balance==this.getBalance();
    }

}
