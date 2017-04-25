package com.dayton.dolphin.simulation.adapter;

/**
 * Created by root on 17-1-22.
 */
public class Skyrocket {

    private Double simTime;

    private Double mass;

    private Double thrust;

    private Double burnTime;

    public Skyrocket(Double mass, Double thrust, Double burnTime) {
        this.mass = mass;
        this.thrust = thrust;
        this.burnTime = burnTime;
    }

    public Double getSimTime() {
        return simTime;
    }

    public void setSimTime(Double simTime) {
        this.simTime = simTime;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getThrust() {
        return thrust;
    }

    public void setThrust(Double thrust) {
        this.thrust = thrust;
    }


    public Double getBurnTime() {
        return burnTime;
    }

    public void setBurnTime(Double burnTime) {
        this.burnTime = burnTime;
    }
}
