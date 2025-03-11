/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.dao;

import com.task.bean.UsersBean;
import com.task.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manis
 */
public class UsersDAO {
    static Connection conn;
//    public int loginCheck(String userName, String password) throws SQLException{
//        int id =0;
//        conn=ConnectionPool.connectDB();
//        String sql = "select uid from users where username='"+userName+"'and password='"+password+"'";
//        
//        try {
//            Statement stmt = conn.createStatement();
//            
//            ResultSet rs = stmt.executeQuery(sql);
//            if(rs.next()){
//                id = rs.getInt("uid");
//            }
//            conn.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return id;
//    }
//    public static void main(String[] args) throws SQLException {
//        //call registerUser()
//        UsersDAO ud = new UsersDAO();
//        int r = ud.loginCheck("Manish2163", "12345");
//        if(r>0){
//            System.out.println("Login Success");
//        }else{
//            System.out.println("Login fail");
//        }
//    }
//}
//    
public int registerUser(UsersBean ub)  {
    int r =0;
    //Step1:
    //Step2:
    conn = ConnectionPool.connectDB();
    //Step3: write sql query 
    String sql = "insert into users values('"+ub.getUid()+"','"+ub.getName()+"','"+ub.getUsername()+"','"+ub.getPassword()+"','"+ub.getEmail()+"','"+ub.getMobile()+"' )";
    
        try {
            //Step4: create object of statement
            Statement stmt = conn.createStatement();
            //step5: call executUpdate 
            r = stmt.executeUpdate(sql);
            //step6: close the connection
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return r;
 }
    public static void main(String[] args) {
        //call the register
        UsersBean ub = new UsersBean();
        ub.setUid(101);
        ub.setName("Manish");
        ub.setUsername("Manish2163");
        ub.setPassword("12345");
        ub.setEmail("manishroy2163@gmail.com");
        ub.setMobile("6206743012");
        
        UsersDAO ud = new UsersDAO();
        int r = ud.registerUser(ub);
        if(r>0){
            System.out.println("Registration success");
        }else{
            System.out.println("Registration  fail");
        }
    }
}
