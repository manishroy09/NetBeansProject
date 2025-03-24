/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.operations;

import com.manish.bean.Student;
import com.manish.utility.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author manis
 */
public class FindById {

    public static void main(String[] args) {
        //step1: create object of sessionfactory 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        //step2: create object of session 
        Session session = sf.openSession();
        //step3: create object of criteria 
        Criteria crit = session.createCriteria(Student.class);
        //1.findById 
//       crit.add(Restrictions.eq("sid", new Integer(119)));
//       ArrayList<Student> all=(ArrayList<Student>) crit.list();
//       for(Student sb:all){
//           System.out.println("\t"+sb.getName()+"\t"+sb.getEnroll()+"\t"+sb.getTotal()+"\t"+sb.getPer());
//           
//       }
//  2.FindBy Total Marks
//        crit.add(Restrictions.eq("total", new Integer(443)));
//        ArrayList<Student> all = (ArrayList<Student>) crit.list();
//        for (Student sb : all) {
//            System.out.println("\t" + sb.getName() + "\t" + sb.getEnroll() + "\t" + sb.getTotal() + "\t" + sb.getPer());
//
//        } 
        // 3.find data of student whose tatal marks is greater than 288
//        crit.add(Restrictions.gt("total", new Integer(400)));
//        ArrayList<Student> all = (ArrayList<Student>) crit.list();
//        for (Student sb : all) {
//            System.out.println("\t" + sb.getName() + "\t" + sb.getEnroll() + "\t" + sb.getTotal() + "\t" + sb.getPer());
//
//        } 
//4.Find data of student whose total marks is greater than or equal to 288
//        crit.add(Restrictions.ge("total", new Integer(443)));
//        ArrayList<Student> all = (ArrayList<Student>) crit.list();
//        for (Student sb : all) {
//            System.out.println("\t" + sb.getName() + "\t" + sb.getEnroll() + "\t" + sb.getTotal() + "\t" + sb.getPer());
//
//        } 

// 5.find data of student whose tatal marks is less than 443
//        crit.add(Restrictions.lt("total", new Integer(443)));
//        ArrayList<Student> all = (ArrayList<Student>) crit.list();
//        for (Student sb : all) {
//            System.out.println("\t" + sb.getName() + "\t" + sb.getEnroll() + "\t" + sb.getTotal() + "\t" + sb.getPer());
//
//     } 
//6.find data of student whose tatal marks is less than or equal to 443
        crit.add(Restrictions.le("total", new Integer(443)));
        ArrayList<Student> all = (ArrayList<Student>) crit.list();
        for (Student sb : all) {
            System.out.println("\t" + sb.getName() + "\t" + sb.getEnroll() + "\t" + sb.getTotal() + "\t" + sb.getPer());

        }

        session.close();
        sf.close();
    }
}
