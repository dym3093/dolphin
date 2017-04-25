package com.dayton.dolphin.simulation.adapter;

/**
 * Created by root on 16-12-30.
 */
public class PhysicalRocket {

    //燃烧区域
    private Double burnArea;

    //燃烧速度
    private Double burnRate;

    //燃料质量
    private Double fuelMass;

    //总质量
    private Double totalMass;


    public PhysicalRocket(Double burnArea, Double burnRate, Double fuelMass, Double totalMass) {
        this.burnArea = burnArea;
        this.burnRate = burnRate;
        this.fuelMass = fuelMass;
        this.totalMass = totalMass;
    }

    //获取燃烧时间
    public Double getBurnTime(){
        return fuelMass/burnRate;
    }

    //获取质量
    public Double getMass(){
        return  this.totalMass;
    }

    //获取推力
    public Double getThrust(){
        return 0d;
    }

    public static void main(String[] args){
    }
}
