package com.dayton.dolphin.designModel.adapter;

import com.dayton.dolphin.designModel.decorator.RoundPeg;
import com.dayton.dolphin.designModel.decorator.SquarePeg;

/**
 * Created by bruce on 17-5-23.
 */
public class Adapter extends SquarePeg{

    private RoundPeg roundPeg;

    public Adapter(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    public void insert(String str){
        roundPeg.insertIntoHole(str);
    }

}
