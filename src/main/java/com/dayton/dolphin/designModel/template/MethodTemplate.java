package com.dayton.dolphin.designModel.template;

/**
 * Created by bruce on 17-5-23.
 */
public class MethodTemplate extends Benchmark{

    @Override
    public void benchmark() {
        System.out.println("This is "+this.getClass().getSimpleName());
    }

    public static void main(String[] args){
        MethodTemplate template = new MethodTemplate();
        long costTime = template.repeat(100000);
        System.out.println("costTime: "+costTime);
    }
}
