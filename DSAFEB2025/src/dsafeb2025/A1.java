/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Admin
 */
public class A1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(10);
        list.add("hello");
        list.add('A');
        list.add(true);
        list.add(123.45f);
        list.add(45.55555);
        list.add(10);

        System.out.println("Array List : " + list);
        System.out.println("Print Data of Array List Using for loop ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("==>" + list.get(i));
        }

        System.out.println("\nPrint Data of Array List Using for each ");
        for (Object x : list) {
            System.out.print("==>" + x);
        }

        System.out.println("\nPrint Data of ArrayList Using Iterator ");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            if (x.equals(10)) {
                itr.remove();
            }
            System.out.print("====>" + x);
        }
        System.out.println("\n-----------------------------\n");
        System.out.println("" + list);
        System.out.println("\nPrint Data of ArrayList In forward Direction using ListIterator");
        ListIterator ltr = list.listIterator();
        while (ltr.hasNext()) {
            System.out.print("==>" + ltr.next());
        }
        System.out.println("\nPrint Data of ArrayList In Back Direction using ListIterator");
        while (ltr.hasPrevious()) {
            System.out.print("==>" + ltr.previous());
        }
    }
}
