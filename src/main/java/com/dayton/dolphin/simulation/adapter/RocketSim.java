package com.dayton.dolphin.simulation.adapter;

/**
 * Created by root on 16-12-30.
 */
public interface RocketSim {

    Double getMass();

    Double getThrust();

    void setSimTime(Double time);
}
