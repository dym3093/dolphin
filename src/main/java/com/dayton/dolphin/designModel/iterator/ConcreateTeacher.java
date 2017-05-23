package com.dayton.dolphin.designModel.iterator;

import java.util.ArrayList;

/**
 * Created by bruce on 17-5-23.
 */
public class ConcreateTeacher implements Teacher{

    private static ArrayList<String> present = new ArrayList<>();

    static {
        present.add("哪吒来了");
        present.add("葫芦小金刚没来");
        present.add("皮诺曹来了");
        present.add("皇后没来");
    }

    @Override
    public Iterator createIterator() {
        return new ConcreateIterator(this);
    }

    /**
     * 获取出勤情况
     * @param i
     * @return
     */
    public String getShow(int i){
        return present.get(i);
    }

    public int getSize(){
        return present.size();
    }
}
