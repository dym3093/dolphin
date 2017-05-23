package com.dayton.dolphin.designModel.cor;

/**
 * Created by bruce on 17-5-23.
 */
public class MyRequest {

    private String type;

    public MyRequest(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void execute(){
        System.out.println("Class name is "+this.getClass().getSimpleName());
    }
}
