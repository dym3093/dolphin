package com.dayton.dolphin.simulation.adapter;

/**
 * Created by root on 17-1-22.
 */
public class OozinozSkyrocket extends Skyrocket{

    private  PhysicalRocket rocket;

    public OozinozSkyrocket(PhysicalRocket rocket) {
        super(rocket.getMass(), rocket.getThrust(), rocket.getBurnTime());
        this.rocket = rocket;
    }


    public Double getMass(){
        return rocket.getMass();
    }

    public Double getThrust(){
        return rocket.getThrust();
    }
}
