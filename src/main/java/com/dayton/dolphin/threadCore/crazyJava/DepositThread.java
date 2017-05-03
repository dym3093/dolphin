package com.dayton.dolphin.threadCore.crazyJava;
/**
 * Created by daimian on 17-5-3.
 */

/**
 * 存款线程
 *
 * @author Damian
 * @create 2017-05-03 下午2:13
 **/
public class DepositThread extends Thread{

    private Account account;
    private double depositAmount;

    public DepositThread(String name, Account account, double depositAmount){
        super(name);
        setAccount(account);
        setDepositAmount(depositAmount);
    }

    public void run(){
        for (int i=0; i<100; i++){
            account.deposit(depositAmount);
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

}
