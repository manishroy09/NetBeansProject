/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.utility;

/**
 *
 * @author manis
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connectionpool {
    static Connection conn;
    
    public  static Connection connectDB(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/Internship";
            String userName = "root";
            String password = "Manish@2163"; 
            conn = DriverManager.getConnection(url,userName, password);
            System.out.println("Database Connection Success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectionpool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connectionpool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
       
    }
    public static void main(String[] args) {
        connectDB();
    }
}
