package com.dayton.dolphin.util;/**
 * Created by daimian on 17-4-21.
 */

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Damian
 * @create 2017-04-21 下午2:16
 **/
public class DbUtils {

    static Logger log = Logger.getLogger(DbUtils.class);

    private static String url;
    private static String user;
    private static String password;

    public static void main(String[] args){
        String myUrl = "jdbc:oracle:thin:@172.16.212.100:1521:orcl";
        String myUser = "YMJY";
        String myPassword = "YMJY";
        Connection conn = DbUtils.getConnection(myUrl, myUser, myPassword);
        log.info("Connection info: " + info());
        if (conn!=null) {
            log.info("conn: " + conn);
        }else {
            log.info("Connection is null");
        }
    }

    private static ThreadLocal<Connection> connectionHolder =
            new ThreadLocal<Connection>(){

        @Override
        public Connection initialValue(){
            try {
                return DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                log.info(e);
            }
            return null;
        }
    };

    public static Connection getConnection(){
        return connectionHolder.get();
    }

    public static Connection getConnection(String url, String user, String password){
        DbUtils.url = url;
        DbUtils.user = user;
        DbUtils.password = password;
        return getConnection();
    }

    public static String info(){
        return "[url="+url+",user="+user+",password="+password+"]";
    }

}
