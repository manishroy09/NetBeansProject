/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package com.manish.databaseoperation;
    import java.sql.*;
    
    
    public class UpdateData {
      public static void main(String[] args) throws ClassNotFoundException, SQLException {
 
      //step1: Register the Driver
       Class.forName("com.mysql.cj.jdbc.Driver");
          //step2: Create The connection
         String url="jdbc:mysql://localhost:3306/jan13";
         String un="root";
         String ps="Manish@2163";
          Connection conn=DriverManager.getConnection(url, un, ps);
         //step3: Write SQL Query (update)
         int sid=104;
         String name="hardik";
         String enroll="123CS4";
         int p=66;
         int c=77;
         int m=89;
         int h=56;
         int e=69;
         int total=p+c+m+h+e;
         float per=total/5.0f;
       String sql="update student set name='"+name+"',enroll='"+enroll+"',p='"+p+"',c='"+c+"',m='"+m+"',h='"+h+"',e='"+e+"',per='"+per+"',total='"+total+"' where sid='"+sid+"' ";
        //step4: Create an object of Statement
        Statement stmt=conn.createStatement();
         //step5: call executeUpdate() method
      int r=stmt.executeUpdate(sql);
        //step6: Close the Connection
       conn.close();
      if(r>0){
        System.out.println("Student Data Updated");
       }else{
         System.out.println("Student Data not updated");
       }
    }
  }
