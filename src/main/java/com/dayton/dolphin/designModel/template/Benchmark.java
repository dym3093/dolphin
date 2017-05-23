package com.dayton.dolphin.designModel.template;

/**
 * Created by bruce on 17-5-23.
 */
public abstract class Benchmark {

    /**
     * 在子类中实现的方法
     */
    public abstract void benchmark();

    /**
     * 重复执行的次数
     * @param count 次数
     * @return long
     */
    public final long repeat(int count){
        if (count<=0){
            return 0;
        } else {
            long start = System.currentTimeMillis();
            for (int i=0; i<count; i++){
                benchmark();
            }
            return (System.currentTimeMillis() - start);
        }
    }
}
