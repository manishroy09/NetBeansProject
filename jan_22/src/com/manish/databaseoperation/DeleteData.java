/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.databaseoperation;
/**
 *
 * @author Admin
 */import java.sql.*;
public class DeleteData {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
 //step1: Register the Driver
 Class.forName("com.mysql.cj.jdbc.Driver");
 //step2: Create the Connection
 String url="jdbc:mysql://localhost:3306/jan13";
 String un="root";
 String ps="Manish@2163";
   Connection conn=DriverManager.getConnection(url, un, ps);
 //step3: Write Sql query delete
 int sid=102;
 String sql="delete from student where sid='"+sid+"'";
 //step4: Create Object of Statement
 Statement stmt=conn.createStatement();
 //step5: call executeUpdate()
 int r=stmt.executeUpdate(sql);
 //step6: close the connection
 conn.close();
 if(r>0){
 System.out.println("Data Deleted success");
 }else{
 System.out.println("Data Not Deleted ");
 }
 }
}
