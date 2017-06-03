package com.dayton.dolphin.test.demo;

import com.dayton.dolphin.headFirst.chp1.entity.DuckCall;
import org.springframework.web.servlet.ModelAndView;

import java.util.Observer;

/**
 * Created by root on 17-1-23.
 */
public class DuckDemo {

    public static void main(String[] args){
        //sound();
        Observer ob = null;
        ModelAndView modelAndView = null;
        int sum = sum(4);
        System.out.println("sum= "+sum);
    }

    public static void sound(){
        new DuckCall().quack();
    }

    public static int sum(int num){
        int total = 0;
        for (int i=1; i<=num; i++){
            int inner = 1;
            for (int j=1; j<=i; j++){
                System.out.println("i="+i+" , j="+j);
                inner = inner*j;
                System.out.println("inner="+inner);
            }
            total += inner;
            System.out.println("total="+total);
        }
        return total;
    }
}
