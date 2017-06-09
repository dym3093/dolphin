package com.dayton.dolphin.threadInner.chap06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by bruce on 17-6-8.
 */
public enum  ConnSingleton {

    connectionFactory;
    private Connection connection;

    private ConnSingleton(){
        try {
            System.out.println("模拟调用MySQL的构造");
            Class.forName("");
            connection = DriverManager.getConnection("","","");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getInstance(){
        return ConnSingleton.connectionFactory.connection;
    }

}
