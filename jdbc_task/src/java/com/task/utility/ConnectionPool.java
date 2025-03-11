/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.utility;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manis
 */
public class ConnectionPool {
    static Connection conn;
    
    public static Connection connectDB() {
        try {
            //Step1: Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step2: Create the connection
            String url = "jdbc:mysql://localhost:3306/empdb";
            String userName = "root";
            String password = "Manish@2163";
            conn = DriverManager.getConnection(url,userName, password);
            System.out.println("Database Connection Success");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    public static void main(String[] args) {
        connectDB();
    }
    
}
