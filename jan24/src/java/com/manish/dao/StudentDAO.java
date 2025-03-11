/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.dao;

/**
 *
 * @author manis
 */
import com.manish.bean.StudentBean;
import com.manish.utility.Connectionpool;
//import static com.manish.utility.Connectionpool.connectDB;
import  java.sql.*;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentDAO {
    static Connection conn;
    public int addStudent(StudentBean sb){
            int r =0;
//step 1:
//step 2:
conn = Connectionpool.connectDB();
//Step 3: write sql Query 
int total = sb.getP()+ sb.getC()+sb.getM()+sb.getE()+sb.getH();
float per = total/5.0f;

String sql = "insert into student values( '"+sb.getSid()+"', '"+sb.getName()+"', '"+sb.getEnroll()+"', '"+per+"', '"+sb.getP()+"', '"+sb.getC()+"', '"+sb.getM()+"', '"+sb.getH()+"', '"+sb.getE()+"', '"+total+"')";

 try {
            // step4: Create object of Statement
            Statement stmt = conn.createStatement();
            
            //Step5: call executeUpdate 
            r = stmt.executeUpdate(sql);
            
            //Step6: close the connection 
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
return r;
   }
    
//    public static void main(String[] args) {
//        StudentBean sb = new StudentBean();
//        sb.setC(73);
//        sb.setE(88);
//        sb.setEnroll("0111CS221012");
//        sb.setH(90);
//        sb.setM(91);
//        sb.setP(82);
//        sb.setName("Raman");
//        sb.setSid(111);
//        
//        StudentDAO sd = new StudentDAO();
//        int result = sd.addStudent(sb);
//        
//        if(result>0){
//            System.out.println("Student Added  Success");
//          } else{
//            System.out.println("Student Not Added");
//        }
//      }




public int updateStudent(StudentBean sb){
 
//step 1:
//step 2:
conn = Connectionpool.connectDB();
//Step 3: write sql Query 
int total = sb.getP()+ sb.getC()+sb.getM()+sb.getE()+sb.getH();
float per = total/5.0f;

String sql = "update student set  name= '"+sb.getName()+"', enroll='"+sb.getEnroll()+"', p='"+sb.getP()+"', c='"+sb.getC()+"' ,m= '"+sb.getM()+"', e='"+sb.getE()+"', h='"+sb.getH()+"',total= '"+total+"', per='"+per+"' where sid='"+sb.getSid()+"' ";
   int r =0;
        try {
            // step 4: create object of statement
            Statement stmt = conn.createStatement();
            
            //step5: call executeUpdate()
            r=stmt.executeUpdate(sql);
            
            //step6: close the connection
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
  return r;
    }

    public static void main(String[] args) {
        StudentBean sb = new StudentBean();
        sb.setP(70);
        sb.setC(75);
        sb.setE(72);
        sb.setEnroll("0111CS221031");
        sb.setH(85);
        sb.setM(90);
        sb.setName("Aman kumar");
        sb.setSid(104);
        
        StudentDAO sd = new StudentDAO();
        int result = sd.updateStudent(sb);
        
        if(result>0){
            System.out.println("Student Update Success");
          } else{
            System.out.println("Student Not Updated");
        }
        }


    
public int deletStudent(int sid){
    //step 1
    // step 2
    conn = Connectionpool.connectDB();
    int r =0;
    //step 3: write sql query 
    String sql = "delete from student where sid='"+sid+"'";
        try {
            //step4: Create Object of Statement
            Statement stmt = conn.createStatement();
            
            //Step5: call executeUpdate()
            r= stmt.executeUpdate(sql);
            
            // Step6: close the Connection 
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return r;
      }

//    public static void main(String[] args) {
//        // call deleteStudetn()
//        
//        StudentDAO sd = new StudentDAO();
//        int  x = sd.deletStudent(108);
//        if(x>0){
//            System.out.println("Data Deletion Success");
//        }else{
//            System.out.println("Data Deletion Fail");
//        }       
//    }



public  ArrayList<StudentBean> findAll(){
    //Step1:
    //step2:
    
    conn = Connectionpool.connectDB();
    ArrayList<StudentBean> list = new ArrayList<StudentBean>();
    
    //step3: write sql query select 
    String sql = "select * from student";
        try {
            //step 4: create an object of Statement
            Statement stmt = conn.createStatement();
            // step5: call executequery method
            ResultSet rs = stmt.executeQuery(sql);
            //Step6: Extract data from the Resultset and add into ArrayList
            while(rs.next()){
                StudentBean x=new StudentBean();
                //Step 1: Fatch data from ressultSet and set into the bean
                x.setSid(rs.getInt("sid"));
                x.setName(rs.getString("name"));
                x.setEnroll(rs.getString("enroll"));
                x.setP(rs.getInt("p"));
                x.setC(rs.getInt("c"));
                x.setM(rs.getInt("m"));
                x.setH(rs.getInt("h"));
                x.setE(rs.getInt("e"));
                x.setTotal(rs.getInt("total"));
                x.setPer(rs.getFloat("per"));
                //step 2: add bean object into list
                list.add(x);
                
             
            }
            //step7: close the connection
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
    
 }
//    public static void main(String[] args) {
//        //4.call findall method
//        StudentDAO sd = new StudentDAO();
//        ArrayList<StudentBean> al = sd.findAll();
//        for(StudentBean s: al){
//            System.out.println("\t"+s.getSid()+"\t"+s.getName()+"\t"+s.getEnroll()+"\t"+s.getP()+"\t"+s.getC()+"\t"+s.getM()+"\t"+s.getH()+"\t"+s.getE()+"\t"+s.getTotal()+"\t"+s.getPer());
//            
//        }
//    }




public  StudentBean findById(int id){
    //Step1:
    //step2:
     StudentBean x=new StudentBean();
    conn = Connectionpool.connectDB();
    
    
    //step3: write sql query select 
    String sql = "select * from student where sid='"+id+"'";
        try {
            //step 4: create an object of Statement
            Statement stmt = conn.createStatement();
            // step5: call executequery method
            ResultSet rs = stmt.executeQuery(sql);
            //Step6: Extract data from the Resultset and add into ArrayList
            while(rs.next()){
               
                //Step 1: Fatch data from ressultSet and set into the bean
                x.setSid(rs.getInt("sid"));
                x.setName(rs.getString("name"));
                x.setEnroll(rs.getString("enroll"));
                x.setP(rs.getInt("p"));
                x.setC(rs.getInt("c"));
                x.setM(rs.getInt("m"));
                x.setH(rs.getInt("h"));
                x.setE(rs.getInt("e"));
                x.setTotal(rs.getInt("total"));
                x.setPer(rs.getFloat("per"));
                //step 2: add bean object into list
                
                
             
            }
            //step7: close the connection
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return x;
    
 }
//    public static void main(String[] args) {
//        //4.call findall method
//        StudentDAO sd = new StudentDAO();
//        StudentBean sb = sd.findById(101);
//        
//        
//            System.out.println("\t"+sb.getSid()+"\t"+sb.getName()+"\t"+sb.getEnroll()+"\t"+sb.getP()+"\t"+sb.getC()+"\t"+sb.getM()+"\t"+sb.getH()+"\t"+sb.getE()+"\t"+sb.getTotal()+"\t"+sb.getPer());
//            
//        
//    }
}
