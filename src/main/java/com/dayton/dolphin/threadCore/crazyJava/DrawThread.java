package com.dayton.dolphin.threadCore.crazyJava;/**
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
        if (drawAmount<=account.getBalance()){
            System.out.println(this.currentThread().getName()+" 操作成功，"
                    + "取出现金["+drawAmount+"]");
            account.setBalance(account.getBalance()-this.getDrawAmount());
            System.out.println(this.currentThread().getName()+" 操作取现后，" +
                    "账号["+ account.getAccountNo() +"]," +
                    "余额["+ account.getBalance() +"]");
        }else{
            System.out.println(this.currentThread().getName()
                    + " 操作失败，取现金额["+this.getDrawAmount()+"]"
                    + "大于账号余额[+"+this.getAccount().getBalance()+"]");
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
