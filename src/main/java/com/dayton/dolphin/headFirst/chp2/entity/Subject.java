package com.dayton.dolphin.headFirst.chp2.entity;

/**
 * 主题
 * Created by root on 17-1-24.
 */
public interface Subject {

    /**
     * 注册
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 取消
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知
     *
     */
    void notifyObservers();

}
