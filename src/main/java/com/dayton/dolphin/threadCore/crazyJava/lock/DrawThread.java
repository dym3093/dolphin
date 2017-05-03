package com.dayton.dolphin.threadCore.crazyJava.lock;/**
 * Created by daimian on 17-5-1.
 */

/**
 * 取钱线程
 *
 * @author Damian
 * @create 2017-05-01 下午11:05
 **/
public class DrawThread extends Thread{
    //用户账号
    private Account account;
    //希望取到的金额
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount){
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    public void run(){
        for (int i=0; i<100; i++) {
            account.draw(getDrawAmount());
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getDrawAmount() {
        return drawAmount;
    }

    public void setDrawAmount(double drawAmount) {
        this.drawAmount = drawAmount;
    }

}
