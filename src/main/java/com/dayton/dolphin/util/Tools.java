package com.dayton.dolphin.util;/**
 * Created by admin on 2016/12/16.
 */

import com.dayton.dolphin.test.entity.ErpPreCustomer;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 工具类
 *
 * @author YoumingDeng
 * @since 2016-12-16 17:35
 */
public class Tools {

    private Class<?> clazz;

    public static void main(String[] args) throws ParseException {
        //String tip = PropsUtils.getString("status","tip");
        //System.out.println("tip: "+tip);
//        String typeSim = findTypeNameSimple(ErpPreCustomer.class, ErpPreCustomer.F_CREATETIME);
//        System.out.println("typeSim: "+typeSim);
//
//        String typeTotal = findTypeNameTotal(ErpPreCustomer.class, ErpPreCustomer.F_CREATETIME);
//        System.out.println("typeTotal : "+typeTotal);
//
//        String type= findTypeName(ErpPreCustomer.class, ErpPreCustomer.F_CREATETIME, Boolean.parseBoolean(null));
//        System.out.println("type: "+type);
//
//        Type typeClass = findType(ErpPreCustomer.class, ErpPreCustomer.F_CREATETIME);
//        System.out.println("typeClass: "+typeClass);
//
//        String typeClassStr1 = findTypeTest1(ErpPreCustomer.class, ErpPreCustomer.F_CREATETIME);
//        System.out.println("typeClassStr1: "+typeClassStr1);
//
//        String typeClassStr2 = findTypeTest2(ErpPreCustomer.class, ErpPreCustomer.F_CREATETIME);
//        System.out.println("typeClassStr2: "+typeClassStr2);

    }

    public static void testProp1(){
        List<File> files = findFile("status.properties",null, true);
        System.out.println("size: "+files.size());
        for (File f: files) {
            System.out.println("size: " + f.getName());
            System.out.println("size: " + f.getPath());
        }
    }

    public static Integer calOverNum(Date destDate, Date stdDate, Integer unit){
        Integer num = 0;
        if(stdDate!=null) {
            if(destDate==null){
                destDate = Calendar.getInstance().getTime();
            }
            if(0==unit||null==unit){
                unit = Calendar.SECOND;
            }
            long org = stdDate.getTime();
            long dest = destDate.getTime();
            System.out.println("org: "+org);
            System.out.println("dest: "+dest);
            Integer divisor = 0;
            if(Calendar.SECOND==unit){
                divisor = 1000;
            }else if (Calendar.HOUR == unit) {
                divisor = 60 * 60 * 1000;
            } else if (Calendar.DAY_OF_YEAR == unit) {
                divisor = 24 * 60 * 60 * 1000;
            }
            num = (int) ((float)(dest - org) / divisor);
        }
        return num;
    }

    /**
     * @description 查找项目中的文件
     * @param fileName 文件名
     * @author YoumingDeng
     * @since: 2016/12/21 3:19
     */
    public static List<File> findFile(String fileName){
       return findFile(fileName,null,true) ;
    }

    /**
	 * @description 查找项目中的文件
     * @param fileName 文件名
     * @param dir 查找的目录，如果为空，则从 /WEB-INF/classes中查找
     * @param isExact 是否完全匹配查找，true:是，false:否
	 * @author YoumingDeng
	 * @since: 2016/12/20 2:57
	 */
	public static List<File> findFile(String fileName, String dir, boolean isExact ){
		List<File> list = null;
		if(fileName!=null&&fileName.trim().length()>0){
			if(StringUtils.isEmpty(dir)){
				//dir = System.getProperty("user.dir");
                dir = Thread.currentThread().getContextClassLoader().getResource("").getPath();
				//System.out.println("dir: "+dir);
			}
			File dirFile = new File(dir);
            list = new ArrayList<File>();
			if(dirFile.exists()&&dirFile.isDirectory()) {
				File[] files = dirFile.listFiles();
				if(files!=null&&files.length>0){
                    File existDir = null;
					for (int i=0; i<files.length; i++){
                        existDir = files[i];
						if(existDir.isDirectory()||!existDir.getPath().contains("lib")){
                            //System.out.println("文件夹路径："+existDir.getPath());
							list.addAll(findFile(fileName, files[i].getPath(), isExact));
						}
					}
				}else{
					System.out.println(dir+"中没有任何文件!");
				}
			}else{
                //严格等于
                if (isExact) {
                    if (fileName.equals(dirFile.getName())){
                        list.add(dirFile);
                    }
                }else {
                    if(StringUtils.containsIgnoreCase(dirFile.getName(),fileName)){
                        list.add(dirFile);
                    }
                }
            }
		}
		return list;
	}


    /**
     * 根据属性名称获取类属性
     * @param clazz 类
     * @param fieldName 属性名称
     * @return Field
     */
	public static Field findField(Class<?> clazz, String fieldName){
        Field field = null;
        if(clazz!=null&&!"object".equalsIgnoreCase(clazz.getName())&&fieldName!=null&&fieldName.trim().length()>0){
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        return field;
    }

    /**
     * 根据属性名称获取其属性的类型名称
     * @param clazz 类
     * @param fieldName 属性名称
     * @param findSimple true:简单类型名称，false:类型全名称
     * @return String
     */
    public static String findTypeName(Class<?> clazz, String fieldName, Boolean findSimple){
	    String type = null;
        if(fieldName!=null&&fieldName.trim().length()>0){
            Field field = findField(clazz,fieldName);
            if(field!=null){
                if(findSimple) {
                    type = field.getType().getSimpleName();
                }else{
                    type = field.getType().getName();
                }
            }
        }
	    return type;
    }

    /**
     * 根据属性名称获取其属性的类型名称
     * @param clazz 类
     * @param fieldName 属性名称
     * @return String
     */
    public static String findTypeNameSimple(Class<?> clazz, String fieldName){
        return findTypeName(clazz,fieldName,true);
    }

    /**
     * 根据属性名称获取其属性的类型名的全称
     * @param clazz 类
     * @param fieldName 属性名称
     * @return String 类型名称全称
     */
    public static String findTypeNameTotal(Class<?> clazz, String fieldName){
        return findTypeName(clazz,fieldName,false);
    }


    /**
     * 获取属性的类型
     * @param clazz 类
     * @param fieldName 属性名称
     * @return String 类型名称全称
     * @author Damian
     * @since 2016-12-29
     */
    public static Type findType(Class<?> clazz, String fieldName){
        //return findField(clazz,fieldName).getGenericType();
        return findField(clazz,fieldName).getType();
    }

    public static String findTypeTest1(Class<?> clazz, String fieldName){
        //return findField(clazz,fieldName).getGenericType();
        return findField(clazz,fieldName).getType().getName();
    }

    public static String findTypeTest2(Class<?> clazz, String fieldName){
        return findField(clazz,fieldName).getGenericType().toString();
    }

}










































