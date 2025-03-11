     package com.manish.databaseoperation;
     import java.sql.*;
     
     
     public class InsertData {
     //main method shortcut psvm press Tab
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
      //step1: Register the driver
       Class.forName("com.mysql.cj.jdbc.Driver");
 
       //step2: Create the Connection
      String url="jdbc:mysql://localhost:3306/jan13";
      String un="root";
      String ps="Manish@2163";
      Connection conn=DriverManager.getConnection(url, un, ps);
       //step3: Write Sql insert query
       int sid=103;
        String name="Mohit";
        String enroll="123CS4";
        int p=81;
        int c=78;
        int m=69;
        int h=50;
        int e=49;
        int total=p+c+m+h+e;
        float per=total/5.0f;
 
       String sql="insert into student values('"+sid+"','"+name+"','"+enroll+"','"+per+"','"+p+"','"+c+"','"+m+"','"+h+"','"+e+"','"+total+"')";
 
        //step4: create an object of Statement
       Statement stmt=conn.createStatement();
      //step5: call executeUpdate() method
       int r=stmt.executeUpdate(sql);
        //step6: close the connection
      conn.close();
       if(r>0){
         System.out.println("Data insertion success");
       }else{
         System.out.println("Data Insertion Fail");
        }
     }
  }