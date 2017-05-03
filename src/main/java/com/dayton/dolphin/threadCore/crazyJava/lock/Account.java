package com.dayton.dolphin.threadCore.crazyJava.lock;
/**
 * Created by daimian on 17-5-1.
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 账号相关信息
 *
 * @author Damian
 * @create 2017-05-01 下午10:57
 **/
public class Account {

    //可重入锁
    private final ReentrantLock lock = new ReentrantLock();
    //获得制定Lock对象对应的Condition
    private final Condition condition = lock.newCondition();
    //账号
    private String accountNo;
    //余额
    private double balance;
    //是否有存款
    private boolean flag = false;

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
            if (!flag){
                condition.await();
            }else {
                if (drawAmount <= getBalance() && drawAmount >= 0) {
                    System.out.println(" 操作成功! 从账号[" + getAccountNo() + "]中取出现金[" + drawAmount + "]");
                    setBalance(balance - drawAmount);
                    System.out.println(" 操作取现后，账号[" + getAccountNo() + "]," + "余额[" + getBalance() + "]");
                    isDraw = true;//取款成功
                } else {
                    System.out.println("操作失败，取现金额[" + drawAmount + "]大于账号[" + getAccountNo() + "]中的余额[" + getBalance() + "]");
                }
                flag = false;//操作完成后可以进行存款
                condition.signalAll();//唤醒其他线程
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return isDraw;
    }

    /**
     * 存款
     * @param depositAmount
     * @return boolean
     */
    public boolean deposit(double depositAmount){
        try {
            lock.lock();
            if (flag){
                condition.await();
            } else {
                if (depositAmount > 0) {
                    System.out.println("执行存款操作! 往账号[" + getAccountNo() + "]中存入金额[" + depositAmount + "]");
                    setBalance(getBalance() + depositAmount);
                    System.out.println("存款成功! 账号[" + getAccountNo() + "]现有余额[" + getBalance() + "]");
                }
                flag = true;
                condition.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return flag;
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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
