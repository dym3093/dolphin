package com.dayton.dolphin.threadCore.crazyJava;/**
 * Created by daimian on 17-5-1.
 */

import java.util.concurrent.locks.ReentrantLock;

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
    //可重入锁
    private final ReentrantLock lock = new ReentrantLock();

    public Account(String accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    /**
     * 取现操作
     * @param drawAmount 取现金额
     * @return boolean 取现是否成功
     * @since 2017-05-02
     */
    public boolean draw(double drawAmount){
        boolean isDraw = false;
        try {
            lock.lock();
            if (drawAmount <= getBalance() && drawAmount >= 0) {
                System.out.println(" 操作成功! 从账号[" + getAccountNo() + "]中取出现金[" + drawAmount + "]");
                setBalance(balance - drawAmount);
                System.out.println(" 操作取现后，账号[" + getAccountNo() + "]," + "余额[" + getBalance() + "]");
                isDraw = true;
            } else {
                System.out.println("操作失败，取现金额[" + drawAmount + "]大于账号[" + getAccountNo() + "]中的余额[" + getBalance() + "]");
            }
        }finally {
            lock.unlock();
        }
        return isDraw;
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
