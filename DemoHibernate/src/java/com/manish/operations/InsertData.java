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
public class InsertData {
    public static void main(String[] args) {
        //step1: create object of session factory 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        //step2: create object of session 
        Session session = sf.openSession();
        //step3: create object of student bean class
        Student sb = new Student();
        //step4: set all data into beans
        sb.setC(88);
        sb.setE(99);
       sb.setEnroll("0111CS221031");
        sb.setH(88);
        sb.setM(89);
        sb.setName("Aman Yadav");
        sb.setP(79);
        sb.setSid(31);
        int total = sb.getP()+sb.getC()+sb.getM()+sb.getH()+sb.getE();
         float per = total/5.0f;
         sb.setTotal(total);
         sb.setPer(per);
         //step5: calll save method 
         session.save(sb);
         //step6: create an object of transaction 
         Transaction tx = session.beginTransaction();
         //Step7: call commit method 
         tx.commit();
         //Stpe8: close
         session.clear();
         sf.close();
    }
}

