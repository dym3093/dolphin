package com.dayton.dolphin.designModel.flyWeight;/**
 * Created by daimian on 17-5-22.
 */

import java.util.concurrent.ConcurrentHashMap;

/**
 * 工厂类
 *
 * @author Damian
 * @create 2017-05-22 下午4:28
 **/
public class FlyWeightFactory{
    //Object POOL
    private ConcurrentHashMap<String, FlyWeight> pool = new ConcurrentHashMap<>();

    public FlyWeight getFlyWeight(String key){
        FlyWeight target = pool.get(key);
        if (target == null){
            target = new ConcreteFlyWeight();
            pool.put(key, target);
        }
        return target;
    }

}
