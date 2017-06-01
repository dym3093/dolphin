package com.dayton.dolphin.threadAction.immutableObject.mmsc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 彩信中心路由规则管理器
 * Created by bruce on 17-6-1.
 */
public final class MMSCRouter {

    //保证多线程的可见性
    private static volatile MMSCRouter instance = new MMSCRouter();
    //手机号码前缀到彩信中心的关联
    private final Map<String, MMSCInfo> routeMap;

    public MMSCRouter(){
        //将数据库表的数据加载到内存中
        routeMap = MMSCRouter.retrieveRouteMapFromDB();
    }

    private static Map<String, MMSCInfo> retrieveRouteMapFromDB(){
        Map<String, MMSCInfo> map = new HashMap<>();
        return map;
    }

    public static MMSCRouter getInstance(){
        return instance;
    }

    /**
     * 根据手机号码前缀获取对应的彩信中心信息
     * @param msisdnPrefix 手机号码前缀
     * @return MMSCInfo 彩信中心信息
     */
    public MMSCInfo getMMSC(String msisdnPrefix){
        return routeMap.get(msisdnPrefix);
    }

    /**
     * 将当前MMSCRouter实例更新为指定的新实例
     * @param mmscRouter MMSCRouter实例
     */
    public static void setInstance(MMSCRouter mmscRouter){
        instance = mmscRouter;
    }

    /**
     * 深度复制
     * @param otherMap Map<String, MMSCInfo>
     * @return Map<String, MMSCInfo>
     */
    private Map<String, MMSCInfo> deepCopy(Map<String, MMSCInfo> otherMap){
        Map<String, MMSCInfo> map = null;
        if (!otherMap.isEmpty()){
            map = new HashMap<>();
            for (Map.Entry<String, MMSCInfo> entry : otherMap.entrySet()) {
                map.put(entry.getKey(), new MMSCInfo(entry.getValue()));
            }
        }
        return map;
    }

    public Map<String, MMSCInfo> getRouteMap(){
        //防御性复制
        return Collections.unmodifiableMap(deepCopy(routeMap));
    }
}
