package com.dayton.dolphin.threadAction.immutableObject;

/**
 * 位置信息
 * Created by bruce on 17-5-28.
 */
public final class Location {

    private final double x;
    private final double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return new Double(x);
    }

    public double getY() {
        return new Double(y);
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }

}
