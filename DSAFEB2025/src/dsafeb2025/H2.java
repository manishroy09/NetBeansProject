/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author manis
 */
public class H2 {

    public static void main(String[] args) {
//        HashMap<String,Integer> hm = new HashMap();
//       hm.put("A", 1);
//       hm.put("B", 1);
//       hm.put("C", 2);
//       hm.put("D", 3);
//       hm.put("E", 5);
//       Set keys=hm.keySet();
//        System.out.println(" keys"+keys);
//        System.out.println("Print element of HashMap using Map.Entry");
//        for(Map.Entry<String,Integer> k:hm.entrySet()){
//            System.out.println("Key is :" +k.getKey()+"  Values is : "+k.getValue());
//        }

//       
//LinkedHashMap
//        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
//        hm.put(100, "A");
//        hm.put(10, "B");
//        hm.put(200, "C");
//        hm.put(30, "D");
//        hm.put(500, "E");
//
//        System.out.println("" + hm);
//
//        Set keys = hm.keySet();
//
//        System.out.println(
//                "print element of HasMap using Map.Entry  ");
//        for (Map.Entry<Integer, String> k : hm.entrySet()) {
//            System.out.println("Key is : " + k.getKey() + "  Value is " + k.getValue());
//        }
// TreeMap
//        TreeMap<Integer, String> hm = new TreeMap<>();
//        hm.put(100, "A");
//        hm.put(10, "B");
//        hm.put(200, "C");
//        hm.put(30, "D");
//        hm.put(500, "E");
//
//        System.out.println("" + hm);
//
//        Set keys = hm.keySet();
//
//        System.out.println("print element of HasMap using Map.Entry");
//        for (Map.Entry<Integer, String> k : hm.entrySet()) {
//            System.out.println("Key is : " + k.getKey() + " Value is " + k.getValue());
//        }
// HashTable
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
        hm.put(100, "A");
        hm.put(10, "B");
        hm.put(200, "C");
        hm.put(30, "D");
        hm.put(500, "E");
        hm.put(100, "AAAA");

        System.out.println("" + hm);

        Set keys = hm.keySet();

        System.out.println("Contains Key : " + hm.containsKey(30));
        System.out.println("value check " + hm.containsValue("D"));

        System.out.println("print element of HasMap using Map.Entry");
        for (Map.Entry<Integer, String> k : hm.entrySet()) {
            System.out.println("Key is : " + k.getKey() + " Value is " + k.getValue());
        }
    }
}
