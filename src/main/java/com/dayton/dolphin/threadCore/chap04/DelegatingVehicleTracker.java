package com.dayton.dolphin.threadCore.chap04;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by bruce on 17-4-25.
 */
public class DelegatingVehicleTracker {
    private final ConcurrentHashMap<String,Point> locations;
    private final Map<String,Point> unmodifiableMap;

    public DelegatingVehicleTracker(Map<String,Point> map){
        locations = new ConcurrentHashMap<String,Point>(map);
        unmodifiableMap = Collections.unmodifiableMap(locations);
    }

    public Map<String,Point> getLocations(){
        return unmodifiableMap;
    }

    public Point getLocations(String id){
        return locations.get(id);
    }

    public void setLocations(String id, int x, int y){
        if (locations.replace(id, new Point(x,y))==null){
            throw new IllegalArgumentException("invalid vehicle name: "+id);
        }
    }

}
