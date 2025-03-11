/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.dao;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author manis
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Array: fixed in size after declaring array we cannot change it 
        // It can hold only same type values
        
        
        // ArrayList:
        // Flexible and growable in nature 
        // It can hold same type or different type of data
        // ArrayList class comes from java.util
        // Constructor or ArrayList Class
        //1. ArrayList();
        //2. ArrayList(Collection);
        // Method of ArrayList();
        
        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add(20);
        al.add(true);
        al.add(3.14);
        al.add('x');
        
        System.out.println(al);
        System.out.println("Print Data Using For each loop : ");
        
        for(Object a: al){
            System.out.print("\t" +a);
              }
        System.out.println(" ");
            for(int i=0; i<al.size(); i++){
                System.out.print("===>"+al.get(i));
            }
        System.out.println("Print data of Arraylist using iterator");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Object x = itr.next();
            if(x.equals(20)){
                itr.remove();
            }
            System.out.print("====>"+x);
        }
   }
}
