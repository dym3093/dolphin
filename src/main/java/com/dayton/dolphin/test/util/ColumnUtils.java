package com.dayton.dolphin.test.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.dayton.dolphin.test.entity.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONException;
import org.json.JSONObject;

public class ColumnUtils {

    public static final String TD_HEAD = "<td align=\"center\"> ${entity.";
    public static final String TD_TAIL = "} </td>";

    public static final String TH_HEAD = "<th  export = \"true\" columnEnName = \"";
    public static final String TH_TAIL_1 = "\" columnChName = \"";
    public static final String TH_TAIL_2 = "\" > ";
    public static final String TH_TAIL_3 = " </th> ";

    static CloseableHttpClient httpclient = HttpClients.createDefault();
    static HttpPost post = new HttpPost("http://gene.healthlink.cn:8088/websGene/noticeSaveTestees");
//	static HttpGet get = new HttpGet("http://gene.healthlink.cn:8088/websGene/noticeSaveTestees");

    public static void main(String[] args) throws Exception {
//		printTdColumn(TD_HEAD, TD_TAIL, ErpDict.class);
//		printTHColumn(TH_HEAD, TH_TAIL_1, TH_TAIL_2, TH_TAIL_3, ErpDict.class);
//		
//		String th = "<th type='text' name='bankList[#index#].'"+d+"' fieldClass='required' filedStyle='width: 300px'>@</th>";

        //1.先打印hbm.xml文件
//        printHBMFiledString(ErpSettlementIncomBX.class);
//		//2.转换驼峰写法
//        fiedlCamelCase(ErpSettlementIncomBX.class);
        //3.打印常量名
//        printFinalFiledString(ErpSettlementIncomBX.class);

        //Calendar c = Calendar.getInstance();

		//String filePath = "C:\\Users\\admin\\Desktop\\run.txt";
		//readLine(filePath);

		//runDownload();
		//httpTest("JZ00089141");

//		findPrivateFile(ErpEvents.class);

        //printSetMethod(ErpReportScheduleJY.class);

        //String str = "\u7f3a\u5c11key\u6216\u8005key\u4e0d\u6b63\u786e,\u5982\u9700key\u8bf7\u5148\u7533\u8bf7";
        //String decodeStr = new String(str.getBytes("UTF-8"), Charset.forName("UTF-8"));
        //System.out.println("decodeStr: "+decodeStr);
        ExecutorService service = Executors.newCachedThreadPool();
        Map<String,String> map = new ConcurrentHashMap<String, String>();
        long now = System.nanoTime();
        System.out.print(Arrays.asList("Tom", "Jerry", "Kali"));
        System.out.print(Arrays.asList("Tom", "Jerry", "Kali"));

    }

    public static void runDownload() {
        String noStr = "JZ00089141,JZ00089175";
        String[] arr = noStr.split(",");
        for (int i = 0; i < arr.length; i++) {
            String no = arr[i];
            System.out.println("[" + (i++) + "]团单号: " + no);
            httpTest(no);
//			System.out.println("["+(i++)+"]: "+res);

        }
    }

    public static void testUtf8(String jsonStr) {
        try {
            JSONObject json = new JSONObject(jsonStr);
            System.out.println("str: " + json.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public static String httpTest(String str) {
        String content = null;
        try {
//			List <NameValuePair> params = new ArrayList<NameValuePair>();  
//		    params.add(new BasicNameValuePair("serviceId", str));  
            //String url = "http://localhost:8099/websGene/fetchReport?code="+str+"&down=2";
            String url = "http://gene.healthlink.cn:8088/websGene/fetchReport?code=" + str;
            HttpGet get = new HttpGet(url);
//		    get.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            CloseableHttpResponse resp = httpclient.execute(get);
//			resp.getEntity();
//			InputStream in = resp.getEntity().getContent();
//			content = convertStreamToString(in);
//			System.out.println(content);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    /**
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static String readLine(String path) throws FileNotFoundException {
        String str = null;
        InputStream is = new FileInputStream(path);
        str = convertStreamToString(is);
        System.out.println("str: " + str);
        return str;
    }

    public static String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + ",");
            }
        } catch (IOException e) {
            System.out.println("Error=" + e.toString());
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                System.out.println("Error=" + e.toString());
            }
        }
        return sb.toString();
    }

    public static void testHttps() {
        String url = "https://image.gjk365.com/downloads/pdfs/2016/10/57fc7f7538bbaa494c66a73d.pdf";

    }

    public static void printTel() {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for (int i : index) {
            tel += arr[i];
        }
        System.out.println("tel: " + tel);
    }


    /**
     * 打印grid
     *
     * @param headStr
     * @param tailStr
     * @param clazz
     * @author DengYouming
     * @since 2016-5-3 下午9:10:27
     */
    public static void printTdColumn(String headStr, String tailStr, Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            if ("serialVersionUID".equalsIgnoreCase(f.getName())) {
                continue;
            }
            System.out.println(headStr + f.getName() + tailStr);
        }
    }

    /**
     * @param headStr
     * @param tailStr1
     * @param tailStr2
     * @param tailStr3
     * @param clazz
     */
    public static void printTHColumn(String headStr, String tailStr1, String tailStr2, String tailStr3, Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            if ("serialVersionUID".equalsIgnoreCase(f.getName())) {
                continue;
            }
            System.out.println(headStr + f.getName() + tailStr1 + i + "#" + tailStr2 + i + "#" + tailStr3);
        }
    }

    /**
     * bean中的final String字段
     *
     * @param clazz
     * @author DengYouming
     * @since 2016-5-4 下午4:10:32
     */
    public static void printFinalFiledString(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if ("serialVersionUID".equalsIgnoreCase(field.getName())) {
                continue;
            }
            //数据库原始字段名
            String orgName = field.getName();
            //orgName转换后的写法
            StringBuffer buff = null;
            //类中的字段
            String propName = "";
            //如果有下划线，转换成驼峰写法
            if (orgName.indexOf("_") > -1) {
                buff = new StringBuffer();
                String[] strArr = orgName.split("_");
                for (int j = 0; j < strArr.length; j++) {
                    if (j == 0) {
                        //第一个单词小写
                        buff.append(strArr[j].toLowerCase());
                        continue;
                    }
                    buff.append(firstCharUpcase(strArr[j]));
                }
                //说明已经过转换
                propName = buff.toString();
            } else {
                //如果是单个单词，直接转换成小写属性名
                propName = orgName;
            }
            System.out.println("public static final String F_" + propName.toUpperCase() + " = \"" + propName + "\";");
//			System.out.println("public static final String COL_"+propName.toUpperCase()+" = \""+propName+"\";");
//			System.out.println("<th type='text' name='bankList[#index#]."+propName+" fieldClass='required' filedStyle='width: 300px'>@</th>");
//			System.out.println("<td><input class='required textInput' type='text' value='${bank."+propName+" }' name='bankList[${status.count-1}]."+propName+"' maxlength='50' style='width: 300px;'/></td>");

        }
    }

    /**
     * 打印hbm.xml文件字段
     *
     * @param clazz
     * @author DengYouming
     * @since 2016-5-4 下午4:10:15
     */
    public static void printHBMFiledString(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if ("serialVersionUID".equalsIgnoreCase(field.getName())) {
                continue;
            }
            //数据库原始字段名
            String orgName = field.getName();
            //orgName转换后的写法
            StringBuffer buff = null;
            //类中的字段
            String propName = "";
            //如果有下划线，转换成驼峰写法
            if (orgName.indexOf("_") > -1) {
                buff = new StringBuffer();
                String[] strArr = orgName.split("_");
                for (int j = 0; j < strArr.length; j++) {
                    if (j == 0) {
                        //第一个单词小写
                        buff.append(strArr[j].toLowerCase());
                        continue;
                    }
                    buff.append(firstCharUpcase(strArr[j]));
                }
                //说明已经过转换
                propName = buff.toString();
            } else {
                //如果是单个单词，直接转换成小写属性名
                propName = orgName.toLowerCase();
            }

            //字段的属性（全限定名）
            String fullTypeName = field.getGenericType().toString();
            //字段的属性
            String shortTypeName = fullTypeName.substring(fullTypeName.lastIndexOf(".") + 1);

            //打印hbm.xml中的字段
            System.out.println("<property name=\"" + propName + "\" type=\"" + fullTypeName.replaceAll("class ", "") + "\">");
            System.out.println("	<column name=\"" + orgName + "\"/>");
            System.out.println("</property>");
        }
    }

    /**
     * 类属性的去横杠驼峰写法
     *
     * @param clazz
     * @author DengYouming
     * @since 2016-5-6 下午5:26:40
     */
    public static void fiedlCamelCase(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if ("serialVersionUID".equalsIgnoreCase(field.getName())) {
                continue;
            }
            //数据库原始字段名
            String orgName = field.getName();
            //orgName转换后的写法
            StringBuffer buff = null;
            //类中的字段
            String propName = "";
            //如果有下划线，转换成驼峰写法
            if (orgName.indexOf("_") > -1) {
                buff = new StringBuffer();
                String[] strArr = orgName.split("_");
                for (int j = 0; j < strArr.length; j++) {
                    if (j == 0) {
                        //第一个单词小写
                        buff.append(strArr[j].toLowerCase());
                        continue;
                    }
                    buff.append(firstCharUpcase(strArr[j]));
                }
                //说明已经过转换
                propName = buff.toString();
            } else {
                //如果是单个单词，直接转换成小写属性名
                propName = orgName.toLowerCase();
            }

            //字段的属性（全限定名）
            String fullTypeName = field.getGenericType().toString();
            //字段的属性
            String shortTypeName = fullTypeName.substring(fullTypeName.lastIndexOf(".") + 1);

            //打印转换后的小写字段
            System.out.println("private " + shortTypeName + " " + propName + ";");
        }
    }

    /**
     * 首字母大写，其他全小写
     *
     * @param content
     * @return String
     * @author DengYouming
     * @since 2016-5-6 下午6:19:01
     */
    private static String firstCharUpcase(String content) {
        return content.substring(0, 1).toUpperCase().concat(content.substring(1).toLowerCase());
    }

    private static String firstCharUpcase2(String content) {
        return content.substring(0, 1).toUpperCase().concat(content.substring(1));
    }

    public static Field[] findPrivateFile(Class<?> clazz) {
        Field[] fields = new Field[]{};
        Field[] allFields = clazz.getDeclaredFields();
        for (int i = 0; i < allFields.length; i++) {
            Field field = allFields[i];
            if ("serialVersionUID".equalsIgnoreCase(field.getName()) || field.getName().startsWith("F_")) {
                continue;
            }
            fields = Arrays.copyOf(fields, fields.length + 1);
            fields[fields.length - 1] = field;
            System.out.println("fieldName: " + field.getName());
        }
        return fields;
    }

    public static void printSetMethod(Class<?> clazz) {
        Field[] fs = findPrivateFile(clazz);
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            String typeName = f.getType().getSimpleName();
            if (typeName.equalsIgnoreCase("integer")) {
                typeName = "Int";
            }
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.println("scheduleJY.set" + firstCharUpcase2(f.getName()) + "(orgObj.get" + typeName + "(\"" + f.getName() + "\"));");
        }
    }


    public static String readFile(String srcPath, String destPath) throws Exception {
        String res = null;
        FileInputStream fis = new FileInputStream(srcPath);
        FileOutputStream fos = new FileOutputStream(destPath);
        byte[] buff = new byte[1024];
        int read = -1;

        while ((read = fis.read(buff)) != -1) {
            fos.write(buff);
            fos.flush();
        }
        fos.close();
        fis.close();
        return res;
    }

    public static String filterRead(String srcPath, String destPath) throws Exception {
        String flag = "未完成";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(srcPath)));
        PrintWriter pw = new PrintWriter(destPath);
        String content = null;
        while (true) {
            content = br.readLine();
            if (content.startsWith("create table")) {
                pw.write(content);
                if (content.equals(";")) {
                    continue;
                }
            }
            pw.flush();
            flag = "已完成";
        }

    }

}
