 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.dao;

import com.manish.bean.UsersBean;
import static com.manish.dao.UsersDAO.conn;
import com.manish.utility.Connectionpool;
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
    
    public int registerUser(UsersBean ub){
        int r=0; 
        //step1:
        //step2:
        
        conn = Connectionpool.connectDB();
        //step3: write sql query 
        String sql = "insert into users values('"+ub.getUid()+"', '"+ub.getName()+"', '"+ub.getUsername()+"', '"+ub.getPassword()+"', '"+ub.getEmail()+"', '"+ub.getMobile()+"')";
        
        try {
            //Step4: Create object of Statement
            Statement stmt = conn.createStatement();
            
            //Step5: call executeUpdate
            r=stmt.executeUpdate(sql);
            
            //Step6: close the connection 
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    public static void main(String[] args) {
        UsersBean ub = new UsersBean();
        ub.setUid(101);
        ub.setName("Manish roy");
        ub.setUsername("Manish2163");
        ub.setPassword("1234");
        ub.setEmail("manishroy2163@gmail.com");
        ub.setMobile("6202743012");
        
        UsersDAO ud = new UsersDAO();
        int r = ud.registerUser(ub);
        if(r>0){
            System.out.println("Registration Success");
        }else{
            System.out.println("Registration fail");
        }
    }
    
    
    public int logintCheck(String userName, String password){
        int id=0;
        
        conn=Connectionpool.connectDB();
        String sql = "select uid from users where username='"+userName+"' and password='"+password+"'";
        
        try {
            Statement stmt=conn.createStatement();
            
            ResultSet rs=stmt.executeQuery(sql);
            
            if(rs.next()){
                id=rs.getInt("uid");
            }
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }
    
//    public static void main(String[] args) {
//        UsersDAO ud=new UsersDAO();
//        
//        int r=ud.logintCheck("Manish2163", "1234");
//        if(r>0){
//            System.out.println("Login Success");
//        }else{
//            System.out.println("Login fail");
//        }
//    }
}

   
   