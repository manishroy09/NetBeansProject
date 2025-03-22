/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.operations;

import com.manish.bean.Student;
import com.manish.utility.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author manis
 */
public class FindAll {

    public static void main(String[] args) {
        //step1: create object of session factory 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        //step2: create object of session 
        Session session = sf.openSession();
        //step3: create object of student Query interface 
        Query q = session.createQuery("from Student s");
        ArrayList<Student> all = (ArrayList<Student>) q.list();
        //Step4: Traverse data using for each 
        for (Student sb : all) {
            System.out.println("" + sb.getEnroll() + "\t" + sb.getName() + "\t" + sb.getPer() + "\t" + sb.getTotal());
        }
        session.close();
        sf.close();
    }
}
  