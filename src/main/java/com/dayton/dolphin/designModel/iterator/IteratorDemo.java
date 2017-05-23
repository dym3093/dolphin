package com.dayton.dolphin.designModel.iterator;

/**
 * Created by bruce on 17-5-23.
 */
public class IteratorDemo {

    private Iterator iterator;
    private Teacher teacher = new ConcreateTeacher();

    public void operation(){
        iterator = teacher.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem().toString());
            iterator.next();
        }
    }

    public static void main(String[] args){
        IteratorDemo demo = new IteratorDemo();
        demo.operation();
    }

}
