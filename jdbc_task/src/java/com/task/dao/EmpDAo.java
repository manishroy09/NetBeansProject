/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.dao;

import com.task.bean.EmpBean;
import com.task.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manis
 */
public class EmpDAo {
    static Connection conn;
    public int addEmp(EmpBean eb){
        int r =0;
        //Step1:
        //step2:
        conn = ConnectionPool.connectDB();
        //step3:Write sql query 
        String sql ="insert into emp values('"+eb.getEmpno()+"','"+eb.getEname()+"','"+eb.getJob()+"','"+eb.getMgr()+"','"+eb.getSal()+"','"+eb.getComm()+"','"+eb.getDeptno()+"','"+eb.getHiredate()+"')";
        try {
            //step4: Create object of statement
            Statement stmt = conn.createStatement();
            //step5: call executeUpdate()
            r = stmt.executeUpdate(sql);
            //step6: close the connection 
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
//    public static void main(String[] args) {
//        EmpBean eb = new EmpBean();
//        eb.setEmpno(1111);
//        eb.setEname("manish");
//        eb.setJob("MANAGER");
//        eb.setMgr(123);
//        eb.setHiredate("05-04-2022");
//        eb.setSal(10000);
//        eb.setComm(800);
//        eb.setDeptno(20);
//        EmpDAo ed = new EmpDAo();
//        int result = ed.addEmp(eb);
//        if(result>0){
//            System.out.println("Employee added success");
//        }else{
//            System.out.println("Employee not added");
//        }
//    }
//}
    
    public int UpdateEmp(EmpBean eb){
        int r =0;
        //step1:
        //step2:
        conn = ConnectionPool.connectDB();
        //Step3: write sql query
        String sql = "update emp set ename='"+eb.getEname()+"',job='"+eb.getJob()+"',mgr='"+eb.getMgr()+"',sal='"+eb.getSal()+"',comm='"+eb.getComm()+"',deptno='"+eb.getDeptno()+"',hiredate='"+eb.getHiredate()+"' where empno='"+eb.getEmpno()+"'";
        try {
            //step4: create object of statement
            Statement stmt = conn.createStatement();
            //Step5: call execute Update()
            r = stmt.executeUpdate(sql);
            //Step6: close the connection 
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return r;
    }
//    public static void main(String[] args) {
//        EmpBean eb = new EmpBean();
//        eb.setEname("Manish kumar");
//        eb.setComm(900);
//        eb.setDeptno(10);
//        eb.setHiredate("02-01-2025");
//        eb.setJob("MANAGER");
//        eb.setSal(100000);
//        eb.setMgr(12345);
//        eb.setEmpno(1111);
//        
//        EmpDAo ed = new EmpDAo();
//        int result = ed.UpdateEmp(eb);
//        
//        if(result>0){
//            System.out.println("Employee Update success");
//        }else{
//            System.out.println("Employee not updated");
//        }
//    }
//}
    
public int deleteEmp(int empno){
    int r =0;
    //step1;
    //step2:
    conn = ConnectionPool.connectDB();
    //Step3: write sql query 
    String sql = "delete from emp where empno='"+empno+"'";
        try {
            //Step4: create object of statement ;
            Statement stmt = conn.createStatement();
            // Step5: call executeUpdate();
            r = stmt.executeUpdate(sql);
            //step6: close the connection 
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return r;
 }
//    public static void main(String[] args) {
//        //call deletEmp();
//        EmpDAo ed = new EmpDAo();
//        int x = ed.deleteEmp(1111);
//        if(x>0){
//            System.out.println("Data deletion success");
//        }else{
//            System.out.println("Data deletion fail");
//        }
//    }
//}
    
public ArrayList<EmpBean> findAll(){
    //step1:
    //step2:
    conn = ConnectionPool.connectDB();
    ArrayList<EmpBean> list = new ArrayList<EmpBean>();
    //step3: write sql query select 
    String sql = "select * from Emp";
        try {
            //step4: Create an object of statement
            Statement stmt = conn.createStatement();
            //step5: Call executeQuery method
            ResultSet rs = stmt.executeQuery(sql);
            //step6: Extract data from the ResultSet and add into ArrayList
            while(rs.next()){
                EmpBean x = new EmpBean();
                //step1: Fetch data from resultSet and Set into the bean
                x.setEmpno(rs.getInt("Empno"));
                x.setEname(rs.getString("Ename"));
                x.setJob(rs.getString("job"));
                x.setMgr(rs.getInt("mgr"));
                x.setSal(rs.getFloat("sal"));
                x.setComm(rs.getFloat("comm"));
                x.setDeptno(rs.getInt("deptno"));
                x.setHiredate(rs.getString("hiredate"));
                //step2: add bean object into list
                list.add(x);
            }
            //step7: Close the connection
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
}
//    public static void main(String[] args) {
//        //call findAll Method
//        EmpDAo ed = new EmpDAo();
//        ArrayList<EmpBean> al = ed.findAll();
//        for(EmpBean e : al){
//            System.out.println("\t"+e.getEmpno()+"\t"+e.getEname()+"\t"+e.getJob()+"\t"+e.getMgr()+"\t"+e.getSal()+"\t"+e.getComm()+"\t"+e.getDeptno()+"\t"+e.getHiredate());
//            
//        }
//    }
//}
    
public EmpBean findByEmpno(int empno){
    EmpBean x = new EmpBean();
    conn = ConnectionPool.connectDB();
    //step3: Write sql query 
    String sql = "select * from emp where empno='"+empno+"'";
        try {
            //step4: create object Statement
            Statement stmt = conn.createStatement();
            //step5: call execute Query
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                //stepA: create an object of EmpBean
                //StepB: Fetch data from ResultSet and set into empBean object
                
                x.setEmpno(rs.getInt("Empno"));
                x.setEname(rs.getString("Ename"));
                x.setJob(rs.getString("job"));
                x.setMgr(rs.getInt("mgr"));
                x.setSal(rs.getFloat("sal"));
                x.setComm(rs.getFloat("comm"));
                x.setDeptno(rs.getInt("deptno"));
                x.setHiredate(rs.getString("hiredate"));
                
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return x;
  }
//    public static void main(String[] args) {
//        //5.call findById()
//        EmpDAo ed = new EmpDAo();
//        EmpBean eb = ed.findByEmpno(7369);
//         System.out.println("\t"+eb.getEmpno()+"\t"+eb.getEname()+"\t"+eb.getJob()+"\t"+eb.getMgr()+"\t"+eb.getSal()+"\t"+eb.getComm()+"\t"+eb.getDeptno()+"\t"+eb.getHiredate());
//    }
//}

public ArrayList<EmpBean> findAllByDeptno(int deptno){
    //step1:
    //step2:
    conn = ConnectionPool.connectDB();
    ArrayList<EmpBean> list = new ArrayList<EmpBean>();
    //step3: write sql query select 
    String sql = "select * from Emp where Deptno='"+deptno+"'";
        try {
            //step4: Create an object of statement
            Statement stmt = conn.createStatement();
            //step5: Call executeQuery method
            ResultSet rs = stmt.executeQuery(sql);
            //step6: Extract data from the ResultSet and add into ArrayList
            while(rs.next()){
                EmpBean x = new EmpBean();
                //step1: Fetch data from resultSet and Set into the bean
                x.setEmpno(rs.getInt("Empno"));
                x.setEname(rs.getString("Ename"));
                x.setJob(rs.getString("job"));
                x.setMgr(rs.getInt("mgr"));
                x.setSal(rs.getFloat("sal"));
                x.setComm(rs.getFloat("comm"));
                x.setDeptno(rs.getInt("deptno"));
                x.setHiredate(rs.getString("hiredate"));
                //step2: add bean object into list
                list.add(x);
            }
            //step7: Close the connection
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
}
//    public static void main(String[] args) {
//        //call findAll Method
//        EmpDAo ed = new EmpDAo();
//        ArrayList<EmpBean> al = ed.findAllByDeptno(20);
//        for(EmpBean e : al){
//            System.out.println("\t"+e.getEmpno()+"\t"+e.getEname()+"\t"+e.getJob()+"\t"+e.getMgr()+"\t"+e.getSal()+"\t"+e.getComm()+"\t"+e.getDeptno()+"\t"+e.getHiredate());
//            
//        }
//    }
//}
//   
    private static float sal;
 public ArrayList<EmpBean> sortEmployeeAsceindingOrder(float sal){
    //step1:
    //step2:
    
    conn = ConnectionPool.connectDB();
    ArrayList<EmpBean> list = new ArrayList<EmpBean>();
    //step3: write sql query select 
    String sql = "select * from Emp order by sal asc";
        try {
            //step4: Create an object of statement
            Statement stmt = conn.createStatement();
            //step5: Call executeQuery method
            ResultSet rs = stmt.executeQuery(sql);
            //step6: Extract data from the ResultSet and add into ArrayList
            while(rs.next()){
                EmpBean x = new EmpBean();
                //step1: Fetch data from resultSet and Set into the bean
                x.setEmpno(rs.getInt("Empno"));
                x.setEname(rs.getString("Ename"));
                x.setJob(rs.getString("job"));
                x.setMgr(rs.getInt("mgr"));
                x.setSal(rs.getFloat("sal"));
                x.setComm(rs.getFloat("comm"));
                x.setDeptno(rs.getInt("deptno"));
                x.setHiredate(rs.getString("hiredate"));
                //step2: add bean object into list
                list.add(x);
            }
            //step7: Close the connection
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
}
//    public static void main(String[] args) {
//        //call findAll Method
//        EmpDAo ed = new EmpDAo();
//       
//        ArrayList<EmpBean> al = ed.sortEmployeeAsceindingOrder(sal);
//        
//        for(EmpBean e : al){
//            System.out.println("\t"+e.getEmpno()+"\t"+e.getEname()+"\t"+e.getJob()+"\t"+e.getMgr()+"\t"+e.getSal()+"\t"+e.getComm()+"\t"+e.getDeptno()+"\t"+e.getHiredate());
//            
//        }
//    }
//}

 private static String ename;
 public ArrayList<EmpBean> sortEmployeeAsceindingOrder(String ename){
    //step1:
    //step2:
    
    conn = ConnectionPool.connectDB();
    ArrayList<EmpBean> list = new ArrayList<EmpBean>();
    //step3: write sql query select 
    String sql = "select * from Emp order by ename asc";
        try {
            //step4: Create an object of statement
            Statement stmt = conn.createStatement();
            //step5: Call executeQuery method
            ResultSet rs = stmt.executeQuery(sql);
            //step6: Extract data from the ResultSet and add into ArrayList
            while(rs.next()){
                EmpBean x = new EmpBean();
                //step1: Fetch data from resultSet and Set into the bean
                x.setEmpno(rs.getInt("Empno"));
                x.setEname(rs.getString("Ename"));
                x.setJob(rs.getString("job"));
                x.setMgr(rs.getInt("mgr"));
                x.setSal(rs.getFloat("sal"));
                x.setComm(rs.getFloat("comm"));
                x.setDeptno(rs.getInt("deptno"));
                x.setHiredate(rs.getString("hiredate"));
                //step2: add bean object into list
                list.add(x);
            }
            //step7: Close the connection
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
}
//    public static void main(String[] args) {
//        //call findAll Method
//        EmpDAo ed = new EmpDAo();
//       
//        ArrayList<EmpBean> al = ed.sortEmployeeAsceindingOrder(ename);
//        
//        for(EmpBean e : al){
//            System.out.println("\t"+e.getEmpno()+"\t"+e.getEname()+"\t"+e.getJob()+"\t"+e.getMgr()+"\t"+e.getSal()+"\t"+e.getComm()+"\t"+e.getDeptno()+"\t"+e.getHiredate());
//            
//        }
//    }
//}
    
    //private static float sal;
 public ArrayList<EmpBean> sortEmployeeDescendingOrder(float sal){
    //step1:
    //step2:
    
    conn = ConnectionPool.connectDB();
    ArrayList<EmpBean> list = new ArrayList<EmpBean>();
    //step3: write sql query select 
    String sql = "select * from Emp order by sal desc";
        try {
            //step4: Create an object of statement
            Statement stmt = conn.createStatement();
            //step5: Call executeQuery method
            ResultSet rs = stmt.executeQuery(sql);
            //step6: Extract data from the ResultSet and add into ArrayList
            while(rs.next()){
                EmpBean x = new EmpBean();
                //step1: Fetch data from resultSet and Set into the bean
                x.setEmpno(rs.getInt("Empno"));
                x.setEname(rs.getString("Ename"));
                x.setJob(rs.getString("job"));
                x.setMgr(rs.getInt("mgr"));
                x.setSal(rs.getFloat("sal"));
                x.setComm(rs.getFloat("comm"));
                x.setDeptno(rs.getInt("deptno"));
                x.setHiredate(rs.getString("hiredate"));
                //step2: add bean object into list
                list.add(x);
            }
            //step7: Close the connection
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
}
//    public static void main(String[] args) {
//        //call findAll Method
//        EmpDAo ed = new EmpDAo();
//       
//        ArrayList<EmpBean> al = ed.sortEmployeeDescendingOrder(sal);
//        
//        for(EmpBean e : al){
//            System.out.println("\t"+e.getEmpno()+"\t"+e.getEname()+"\t"+e.getJob()+"\t"+e.getMgr()+"\t"+e.getSal()+"\t"+e.getComm()+"\t"+e.getDeptno()+"\t"+e.getHiredate());
//            
//        }
//    }
//}
    
public double SumSalary() {
        conn = ConnectionPool.connectDB();
        float totalSalary = 0;

        String sql = "SELECT SUM(sal) AS total FROM emp";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                totalSalary = rs.getFloat("total"); // Fetch sum(sal)
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSalary;
    }
//
//    public static void main(String[] args) {
//        EmpDAo ed = new EmpDAo();
//        double totalSal = ed.SumSalary();
//        System.out.println("Total Salary: " + totalSal);
//    }
//}
    
public double SumSalary(int deptno) {
        conn = ConnectionPool.connectDB();
        double totalSalary = 0;

        String sql = "SELECT SUM(sal) as total from emp  where deptno = '"+deptno+"'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                totalSalary = rs.getFloat("total"); // Fetch sum(sal)
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSalary;
    }
//
//    public static void main(String[] args) {
//        EmpDAo ed = new EmpDAo();
//        double totalSal = ed.SumSalary(10);
//        System.out.println("Total Salary: " + totalSal);
//    }
//}


public double SumSalaryByJob(String job) {
        conn = ConnectionPool.connectDB();
        double totalSalary = 0;

        String sql = "SELECT SUM(sal) as total from emp  where job = '"+job+"'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                totalSalary = rs.getFloat("total"); // Fetch sum(sal)
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSalary;
    }
//
//    public static void main(String[] args) {
//        EmpDAo ed = new EmpDAo();
//        double totalSal = ed.SumSalaryByJob("CLERK");
//        System.out.println("Total Salary: " + totalSal);
//    }
//}
    
    public double AvgSalary() {
        conn = ConnectionPool.connectDB();
        float  AvgSalary = 0;

        String sql = "SELECT AVG(sal) AS total FROM emp";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                AvgSalary = rs.getFloat("total"); // Fetch sum(sal)
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AvgSalary;
    }
//
//    public static void main(String[] args) {
//        EmpDAo ed = new EmpDAo();
//        double totalSal = ed.AvgSalary();
//        System.out.println("Average sal : " + totalSal);
//    }
//} 

    public double AvgSalaryByJob(String job) {
        conn = ConnectionPool.connectDB();
        double totalSalary = 0;

        String sql = "SELECT job,AVG(sal) as avg_salary  from emp  where job = '"+job+"'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) { // Iterate through multiple rows
                
                double avgSalary = rs.getDouble("avg_salary");
               
            }


            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSalary;
    }

//    public static void main(String[] args) {
//        EmpDAo ed = new EmpDAo();
//        ed.AvgSalaryByJob("clerk");
//        
//    }
//}

    public double FindMaxSalary() {
        conn = ConnectionPool.connectDB();
        double totalSalary = 0;

        String sql = "SELECT MAX(sal) as max_salary  from emp";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) { // Iterate through multiple rows
                
                double maxSalary = rs.getDouble("max_salary");
                System.out.println("HighestSalary: "+ maxSalary);
            }


            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSalary;
}
//
//    public static void main(String[] args) {
//        EmpDAo ed = new EmpDAo();
//        ed.FindMaxSalary();
//        
//        	
//    }
//}

    public double FindLowSalary() {
        conn = ConnectionPool.connectDB();
        double totalSalary = 0;

        String sql = "SELECT MIN(sal) as min_salary  from emp";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) { // Iterate through multiple rows
                
                double LowSalary = rs.getDouble("min_salary");
                System.out.println("LowestSalary: "+ LowSalary);
            }


            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSalary;
    }
//
//    public static void main(String[] args) {
//        EmpDAo ed = new EmpDAo();
//        ed.FindLowSalary();
//        
//        	
//    }
//}

    public int CountEmp() {
        conn = ConnectionPool.connectDB();
        int count =0;

        String sql = "select count(*) as cnt from emp";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) { // Iterate through multiple rows
                
                int cnt = rs.getInt("cnt");
//                System.out.println("Count number of emp: "+ cnt);
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public static void main(String[] args) {
        EmpDAo ed = new EmpDAo();
        ed.CountEmp();
        
        	
    }

    
    public double countEmpByJob(String job) {
        conn = ConnectionPool.connectDB();
        double totalSalary = 0;

        String sql = "select count(*) as jb from emp where job = '"+job+"'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) { // Iterate through multiple rows
                String cnt = rs.getString("jb");
              //  double avgSalary = rs.getDouble("avg_salary");
                System.out.println( cnt);
            }


            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpDAo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSalary;
    }

//    public static void main(String[] args) {
//        EmpDAo ed = new EmpDAo();
//        ed.countEmpByJob("CLERK");
//        
//    }
}




