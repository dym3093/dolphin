package com.dayton.dolphin.headFirst.chp2.entity;

/**
 * 观察者
 * Created by root on 17-1-24.
 */
public interface Observer {

    /**
     * 更新数据
     * @param subject 数据
     */
    //void update(Subject subject);

    /**
     * 更新数据
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(Float temperature, Float humidity, Float pressure);

}
