/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

import java.util.LinkedList;

/**
 *
 * @author manis
 */
public class L1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(""+list);
        list.addFirst(5);
        System.out.println(""+list);
        list.addLast(40);
        System.out.println(""+list);
        list.add(2, 15);
        System.out.println(""+list);
        list.removeFirst();
        System.out.println(""+list);
        list.removeLast();
        System.out.println(""+list);
        list.remove(3);
        System.out.println(""+list);
    }
}
