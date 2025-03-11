/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author manis
 */
public class h1 {
    public static void main(String[] args) {
        // HashSet has duplication not allowed and insertion order is not preserved
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println("HashSet"+hs);
        
        // LinkedHashSet has duplication not allowed and insertion order are preserved
        LinkedHashSet<Integer> Lh= new LinkedHashSet<Integer>();
        Lh.add(10);
        Lh.add(50);
        Lh.add(30);
        Lh.add(40);
        Lh.add(10);
        Lh.add(20);
        Lh.add(30);
        Lh.add(40);
        System.out.println("LinkedHashSet"+Lh);
        
        // In TreeSet duplication are not allowed and it wil sort data in default (Ascending order)
        TreeSet<Integer> Ts = new TreeSet<Integer>();
        Ts.add(100);
        Ts.add(20);
        Ts.add(300);
        Ts.add(40);
        Ts.add(1000);
        Ts.add(200);
        Ts.add(300);
        Ts.add(400);
        System.out.println("TreeSet"+Ts);
        TreeSet<String> Ts1= new TreeSet<String>();
        Ts1.add("Z");
        Ts1.add("A");
        Ts1.add("Y");
        Ts1.add("Z");
        System.out.println(""+Ts1);
//        TreeSet Ts2= new TreeSet();
//        Ts2.add(new StringBuffer("Z"));
//        Ts2.add(new StringBuffer("A"));
//        Ts2.add(new StringBuffer("Y"));
//        Ts2.add(new StringBuffer("Z"));
    }
}
