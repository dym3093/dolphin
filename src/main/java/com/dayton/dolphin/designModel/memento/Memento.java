package com.dayton.dolphin.designModel.memento;

import java.io.File;
import java.io.Serializable;

/**
 * Created by bruce on 17-5-23.
 */
public class Memento implements Serializable{

    private int number;
    private File file = null;

    public Memento(Originator originator){
        this(originator.getNumber(), originator.getFile());
    }

    public Memento(int number, File file) {
        this.number = number;
        this.file = file;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
