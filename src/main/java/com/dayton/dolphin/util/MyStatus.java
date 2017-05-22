package com.dayton.dolphin.util;
/**
 * Created by daimian on 17-5-1.
 */

import org.springframework.http.HttpStatus;

/**
 * 状态枚举类示例
 *
 * @author Damian
 * @create 2017-05-01 下午10:41
 **/
public enum MyStatus {

    DELETE("DELETE", -1),
    NEW("DEW", 0),
    COMMIT("COMMIT", 2);

    //状态的意义
    private final String tip;
    //状态值
    private final Integer value;

    MyStatus(String tip, Integer value) {
        this.tip = tip;
        this.value = value;
    }

}
