package com.dayton.dolphin.test.util;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by admin on 2016/11/24.
 */
public class FetchReport {

    public static final String DATE_FORMAT_DEFAULT = "yyyyMMddHHmmss";
    public static final String DATE_FORMAT_ALL = "yyyyMMddHHmmssSSS";

    static CloseableHttpClient httpclient = HttpClients.createDefault();

    public static void main(String[] args) throws Exception {
        //System.out.println(new Random().nextInt(7));
        //System.out.println(getRandNumStr(7));

        //System.out.println(getFixLenthString(7));
        //System.out.println(getNumber7FromRandom());
        String filePath = "C:\\Users\\admin\\Desktop\\run.txt";
        //readLine(filePath);

        File file = new File(filePath);
        System.out.println("文件大小： "+file.length());
    }

    public static String getNumber7FromRandom() {
        Random r = new Random();
        int xx = r.nextInt(10000000);
        while (xx < 1000000) {
            xx = r.nextInt(10000000);
        }
        return String.valueOf(xx);
    }

    /*
 * 返回长度为【strLength】的随机数，在前面补0
 */
    private static String getFixLenthString(int strLength) {

        Random rm = new Random();

        // 获得随机数
        double pross = (1 + rm.nextDouble()) * Math.pow(10, strLength);

        // 将获得的获得随机数转化为字符串
        String fixLenthString = String.valueOf(pross);

        // 返回固定的长度的随机数
        return fixLenthString.substring(1, strLength + 1);
    }

    public static String randomStrByDate(Integer len) {
        String ranStr = null;
        String dateStr = getTimeStr();
        int dateStrLen = dateStr.length();
        if (len == null) {
            len = 32;
        }

        return ranStr;
    }

    public static Integer getRandNum(Integer len) {
        Random ran = new Random();
        int ranInt = ran.nextInt(9999999);
        return ranInt;
    }

    public static String getRandNumStr(Integer len) {
        String randNumStr;
        if (len == null || len == 0) {
            len = 32;
        }
        String f_mark = "#.";
        for (int i = 0; i < len - 1; i++) {
            f_mark = f_mark + "0";
        }
        //f_mark = f_mark + "0";
        System.out.println(f_mark);
        DecimalFormat df = new DecimalFormat(f_mark);

        Random random = new Random();
        double seedNum = random.nextDouble();
        double ranDouble = (seedNum) * Math.pow(10, len);
        System.out.println(seedNum + ", " + ranDouble);
        randNumStr = df.format(ranDouble);
        System.out.println(randNumStr);
        return randNumStr;
    }

    /**
     * 获取 yyyyMMddHHmmssSSS格式的时间字符串(例：201611251155436)
     *
     * @return String
     */
    public static String getTimeStr() {
        return getTimeStr(null);
    }

    /**
     * 根据传入的格式获取对应时间格式的字符串
     *
     * @param format 格式类型
     * @return String
     */
    public static String getTimeStr(String format) {
        Date curr = Calendar.getInstance().getTime();
        if (format == null || format.trim().length() == 0) {
            format = DATE_FORMAT_ALL;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String nowTimeStr = sdf.format(curr);
        return nowTimeStr;
    }

    public static String readLine(String path) throws FileNotFoundException {
        String str;
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
                //System.out.println("code: "+line);
                httpTest(line.trim());
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

    public static String httpTest(String str) {
        String content = null;
        //String url = "http://localhost:8099/websGene/fetchReport?code="+str+"&down=2";
        String url_pro = "http://gene.healthlink.cn:8088/websGene/fetchReport?code="+str;
        //String url_pro = "http://gene.healthlink.cn:8088/websGene/fetchReport?eventsNo=" + str;
        System.out.println("url_pro: " + url_pro);
        /*
        HttpGet get = new HttpGet(url_pro);
        try {
            httpclient.execute(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        // int repCode = resp.getStatusLine().getStatusCode();
        //System.out.print("done...");
        return content;
    }
}

