package com.dayton.dolphin.util;/**
 * Created by admin on 2016/12/20.
 */

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.List;
import java.util.Properties;

/**
 * 读取Properties文件
 *
 * @author Dayton
 * @since 2016-12-20 3:37
 */
public class PropsUtils {

    private static Properties prop;

    public static void main(String[] args){
        //String value = getString("status.properties","status.ysq");
        //System.out.println("valueStr: "+value);
        Integer value = getInt("status","status.ysq");
        System.out.println("valueInt: "+value);
        Integer value2 = getInt("status","statusYm.yhq");
        System.out.println("valueInt2: "+value2);

    }
    public static Properties loadProp(String propName){
        List<File> fileList = Tools.findFile(propName);
        File propFile = null;
        if(fileList!=null&&fileList.size()>0){
            propFile = fileList.get(0);
            System.out.println(propName+"的路径: "+propFile.getPath());
            try {
                InputStream is = new FileInputStream(propFile);
                if(is!=null) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
                    prop = new Properties();
                    prop.load(br);
                    System.out.println(propName+"文件已加载！");
                    if(br!=null){
                        br.close();
                    }
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop;
    }

    public static String getString(String propName, String key){
        String value = null;
        if(StringUtils.isNotEmpty(propName)&&StringUtils.isNotEmpty(key)){
            if(!propName.contains(".properties")){
                propName = propName+".properties";
            }
            if(prop!=null){
                value = prop.getProperty(key);
                if(StringUtils.isEmpty(value)){
                    loadProp(propName);
                }
            }else{
                loadProp(propName);
            }
            if(StringUtils.isEmpty(value)) {
                value = prop.getProperty(key);
            }
        }
        return value;
    }

    public static Integer getInt(String propName, String key){
        Integer value = null;
        String tempStr = getString(propName, key);
        if(StringUtils.isNotEmpty(tempStr)){
            value = Integer.valueOf(tempStr);
        }
        return value;
    }
}
