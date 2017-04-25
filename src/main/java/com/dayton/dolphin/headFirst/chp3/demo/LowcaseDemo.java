package com.dayton.dolphin.headFirst.chp3.demo;

import com.dayton.dolphin.headFirst.chp3.entity.LowCaseInputStream;

import java.io.*;

/**
 * Created by root on 17-1-27.
 */
public class LowcaseDemo {

    public static void main(String[] args){

        int c;
        try {
            InputStream is = new LowCaseInputStream(new BufferedInputStream(
                    new FileInputStream("/home/damian/tmp.txt")
            ));
            while ((c=is.read())>=0){
                System.out.print((char)c);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
