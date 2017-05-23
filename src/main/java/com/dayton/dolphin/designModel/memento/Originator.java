package com.dayton.dolphin.designModel.memento;

import java.io.File;

/**
 * Created by bruce on 17-5-23.
 */
public class Originator {

    private int number;

    private File file = null;

    public Originator(){ }

    public Memento getMemento(){
        return new Memento(this);
    }

    /**
     * 恢复原值
     * @param m
     */
    public void setMemento(Memento m){
       setNumber(m.getNumber());
       setFile(m.getFile());
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
