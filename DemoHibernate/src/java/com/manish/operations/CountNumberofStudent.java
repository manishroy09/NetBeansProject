/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.operations;

import com.manish.utility.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author manis
 */
public class CountNumberofStudent {
    public static void main(String[] args) {
         //step1: create object of session factory 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        //step2: create object of session 
        Session session = sf.openSession();
        //1.count Number of Students in the table
//        Query q =session.createQuery("SELECT COUNT(sid) From Student");
//         Long counts=(Long) q.uniqueResult();
//        System.out.println("Number of Students : "+counts); 

      //2.Calculate sum of total marks in the student table
//        Query q = session.createQuery("SELECT sum(total) from Student");
//        Long counts = (Long) q.uniqueResult();
//        System.out.println("Sum of Total Marks : "+counts);    

      //3.Calculate Average marks of physics in the  student table
      Query q=session.createQuery("SELECT avg(p) From Student");
      Double counts =(Double) q.uniqueResult();
        System.out.println("Average Marks of Physics : "+counts);
        session.close();
        sf.close();
    }
}
