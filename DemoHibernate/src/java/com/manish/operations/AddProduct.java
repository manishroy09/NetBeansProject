/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.operations;

import com.manish.bean.Product;
import com.manish.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author manis
 */
public class AddProduct {
    public static void main(String[] args) {
         //step1: create object of session factory 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        //step2: create object of session 
        Session session = sf.openSession();
        //step3: create object of  product  class
        Product p = new Product();
        // step4: set data into bean 
       p.setPid(102);
       p.setPname("mobile");
       p.setPrice(12000);
       
       //step5: calll save method 
         session.save(p);
         //step6: create an object of transaction 
         Transaction tx = session.beginTransaction();
         //Step7: call commit method 
         tx.commit();
         System.out.println("Product Add Success");
         //Stpe8: close
         session.close();
         sf.close();
    }
       
}
