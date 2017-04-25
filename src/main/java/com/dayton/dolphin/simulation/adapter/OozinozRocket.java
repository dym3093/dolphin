package com.dayton.dolphin.simulation.adapter;

/**
 * Created by root on 16-12-31.
 */
public class OozinozRocket extends PhysicalRocket implements RocketSim{

    private Double time;

    public OozinozRocket(Double burnArea, Double burnRate, Double fuelMass, Double totalMass) {
        super(burnArea, burnRate, fuelMass, totalMass);
    }

    public void setSimTime(Double time) {
        this.time = time;
    }

    @Override
    public Double getMass() {
        return super.getMass();
    }

    @Override
    public Double getThrust() {
        return super.getThrust();
    }
}
