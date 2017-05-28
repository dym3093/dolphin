package com.dayton.dolphin.threadAction.immutableObject;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by bruce on 17-5-28.
 */
public class VehicleTracker {

    private Map<String, Location> locMap = new ConcurrentHashMap<>();

    public void updateLocation(String vehicleId, Location location){
        locMap.put(vehicleId, location);
    }

}
