/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.databaseoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author manis
 */
public class findAll {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1: Register the Driver
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Step2: Create the connection
        String url="jdbc:mysql://localhost:3306/jan13";
        String userName="root";
        String password="Manish@2163";
        Connection conn=DriverManager.getConnection(url,userName,password);
        
        //Step3: write sql Query
        
        String sql="select * from student";
        
        // Step4: Create object of statement
        Statement stmt=conn.createStatement();
        
        //Step5: call executeQuery and process ResultSet data
        
        ResultSet rs=stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println("\t"+rs.getInt("sid")+"\t"+rs.getString("name")+"\t"+rs.getString("enroll")+"\t"+rs.getInt("p")+"\t"+rs.getInt("c")+"\t"+rs.getInt("m")+"\t"+rs.getInt("h")+"\t"+rs.getInt("e")+"\t"+rs.getInt("total")+"\t"+rs.getFloat("per"));
        }
        
        //Step6.Close the connection 
        conn.close();
        
    }
}
