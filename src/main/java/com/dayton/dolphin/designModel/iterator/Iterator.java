package com.dayton.dolphin.designModel.iterator;

/**
 * 点名动作接口
 * Created by bruce on 17-5-23.
 */
public interface Iterator {

    //第一个
    void first();
    //下一个
    void next();
    //是否点名完毕
    boolean isDone();
    //当前同学出勤情况
    Object currentItem();

}
