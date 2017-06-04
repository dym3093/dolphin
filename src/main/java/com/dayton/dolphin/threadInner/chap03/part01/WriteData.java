package com.dayton.dolphin.threadInner.chap03.part01;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * Created by bruce on 17-6-5.
 */
public class WriteData {

    public void write(PipedOutputStream out){
        try {
            System.out.println("WriteData writing ...");
            for (int i=0; i<300; i++){
                String data = ""+i;
                out.write(data.getBytes());
                System.out.print(data);
            }
            System.out.println();
            System.out.println("WriteData writing end !!!");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(PipedWriter writer){
         try {
            System.out.println("WriteData writing ...");
            for (int i=0; i<300; i++){
                String data = ""+(i+1);
                writer.write(data);
                System.out.print(data);
            }
            System.out.println();
            System.out.println("WriteData writing end !!!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
