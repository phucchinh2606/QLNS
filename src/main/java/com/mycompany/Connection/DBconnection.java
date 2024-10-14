/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DBconnection {
    private static final String URL = "jdbc:sqlserver://DESKTOP-4CJH403\\SQLEXPRESS:1433;databaseName=erp_database;encrypt=false";

    private static final String userName = "sa";
    private static final String password = "123";

    private static Connection conn = null;

    public DBconnection() {
        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(URL,userName,password);
            } catch(Exception e) {
                e.printStackTrace();
            } 
    }
    
    public  Connection getConnection() {
       try {
                if(conn == null) {
                    conn = DriverManager.getConnection(URL);
                }
            } catch(Exception e) {
                e.printStackTrace();
            } 
            return conn;
        } 

}
