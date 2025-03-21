/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.operations;

import com.manish.bean.Student;
import com.manish.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author manis
 */
public class DeleteData {
    public static void main(String[] args) {
          //step1: create object of session factory 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        //step2: create object of session 
        Session session = sf.openSession();
        //step3: create object of student bean class
        Student sb = new Student(25);
        //step4: call delete method
        session.delete(sb);
         //step5: create an object of transaction 
         Transaction tx = session.beginTransaction();
         //Step6: call commit method 
         tx.commit();
         System.out.println("Data Deletion  success");
         //Stpe7: close
         session.clear();
         sf.close();
        
        
    }
}
