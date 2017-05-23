package com.dayton.dolphin.designModel.adapter;

/**
 * Created by bruce on 17-5-23.
 */
public class PegAdapter implements ISquarePeg, IRoundPeg{

    private MySquarePeg squarePeg;

    private MyRoundPeg roundPeg;

    public PegAdapter(MySquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public PegAdapter(MyRoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    public static void main(String[] args){
        PegAdapter pegAdapter = new PegAdapter(new MySquarePeg());
        pegAdapter.insert("10桩");
    }

    @Override
    public void insertIntoHole(String msg) {
        roundPeg.insertIntoHole(msg);
    }

    @Override
    public void insert(String msg) {
        squarePeg.insert(msg);
    }

    public MySquarePeg getSquarePeg() {
        return squarePeg;
    }

    public void setSquarePeg(MySquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public MyRoundPeg getRoundPeg() {
        return roundPeg;
    }

    public void setRoundPeg(MyRoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }
}
