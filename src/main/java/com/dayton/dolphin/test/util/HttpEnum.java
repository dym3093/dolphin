package com.dayton.dolphin.test.util;


/**
 * Created by daimian on 17-4-11.
 */
public enum HttpEnum{

    APP_JSON("application/json;charset=utf-8","JSON (JavaScript Object Notation)"),
    APP_XML("application/xml;charset=utf-8", "可扩展标记语言（英语：eXtensible Markup Language，简称: XML），是一种标记语言。");

    private final String val;
    private final String hint;

    HttpEnum(String val, String hint){
        this.val = val;
        this.hint = hint;
    }

    public String val(){
        return this.val;
    }

    public String hint(){
        return this.hint;
    }

}
