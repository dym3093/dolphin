package com.dayton.dolphin.threadCore.chap01;/**
 * Created by daimian on 17-4-21.
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author Damian
 * @create 2017-04-21 下午4:05
 **/
public class OneValueCache {
    private final BigInteger lastNumber;
    private final BigInteger[] lastFactors;

    public OneValueCache(BigInteger lastNumber, BigInteger[] lastFactors){
        this.lastNumber = lastNumber;
        this.lastFactors = Arrays.copyOf(lastFactors, lastFactors.length);
    }

    public synchronized BigInteger[] getLastFactors(BigInteger i){
        if (i!=null&&lastNumber.equals(i)){
            //返回副本
            return Arrays.copyOf(lastFactors, lastFactors.length);
        }
        return null;
    }

}
