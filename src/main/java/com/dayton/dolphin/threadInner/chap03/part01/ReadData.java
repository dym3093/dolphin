package com.dayton.dolphin.threadInner.chap03.part01;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by bruce on 17-6-5.
 */
public class ReadData {

    public void read(PipedInputStream in){
        try {
            System.out.println(" ReadData reading ... ");
            byte[] buff = new byte[20];
            int len = in.read(buff);
            while (len!=-1){
                String data = new String(buff, 0, len);
                System.out.println("data: "+data);
                len = in.read(buff);
            }
            System.out.println();
            System.out.println(" ReadData reading end !!! ");
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(PipedReader reader){
         try {
            System.out.println(" ReadData reading ... ");
            char[] buff = new char[20];
            int len = reader.read();
            while (len!=-1){
                String data = new String(buff, 0, len);
                System.out.println("data: "+data);
                len = reader.read(buff);
            }
            System.out.println();
            System.out.println(" ReadData reading end !!! ");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
