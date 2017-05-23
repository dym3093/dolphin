package com.dayton.dolphin.designModel.iterator;

/**
 * 点名类
 * Created by bruce on 17-5-23.
 */
public class ConcreateIterator implements Iterator{

    private int index = 0;
    private int size = 0;

    private ConcreateTeacher teacher;

    public ConcreateIterator(ConcreateTeacher teacher) {
        this.teacher = teacher;
        size = teacher.getSize();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index<size) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return (index>=size);
    }

    @Override
    public Object currentItem() {
        return teacher.getShow(index);
    }

}
