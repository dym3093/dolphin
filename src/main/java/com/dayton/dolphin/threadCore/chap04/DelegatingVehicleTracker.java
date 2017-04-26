package com.dayton.dolphin.threadCore.chap04;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by bruce on 17-4-25.
 */
public class DelegatingVehicleTracker {
    private final ConcurrentHashMap<String,SafePoint> locations;
    private final Map<String,SafePoint> unmodifiableMap;

    public DelegatingVehicleTracker(Map<String,SafePoint> map){
        locations = new ConcurrentHashMap<String,SafePoint>(map);
        unmodifiableMap = Collections.unmodifiableMap(locations);
    }

    public Map<String,SafePoint> getLocations(){
        return unmodifiableMap;
    }

    public SafePoint getLocations(String id){
        return locations.get(id);
    }

    public void setLocations(String id, int x, int y){
        if (!locations.containsKey(id)){
            throw new IllegalArgumentException("invalid vehicle name: "+id);
        }
        locations.get(id).set(x,y);
    }

}
