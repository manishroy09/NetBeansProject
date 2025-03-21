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
public class UpdateData {
    public static void main(String[] args) {
          //step1: create object of session factory 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        //step2: create object of session 
        Session session = sf.openSession();
        //step3: create object of student bean class
        Student sb = new Student();
        //step4: set all data into beans
         sb.setC(68);
        sb.setE(99);
       sb.setEnroll("0111CS221031");
        sb.setH(78);
        sb.setM(59);
        sb.setName("Rahul Kumar");
        sb.setP(59);
        sb.setSid(25);
        int total = sb.getP()+sb.getC()+sb.getM()+sb.getH()+sb.getE();
         float per = total/5.0f;
         sb.setTotal(total);
         sb.setPer(per);
         //step5: cll update method
         session.update(sb);
         //step6: create object of transaction
          //step6: create an object of transaction 
         Transaction tx = session.beginTransaction();
         //Step7: call commit method 
         tx.commit();
         System.out.println("Data Updated success");
         //Stpe8: close
         session.clear();
         sf.close();
    }
}
