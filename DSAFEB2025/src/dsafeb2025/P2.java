/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/**
 *
 * @author manis
 */
public class P2 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(1);
        pq.add(2);
        pq.add(3);

        System.out.println("" + pq);
        System.out.println("Delete Element : " + pq.remove());
        System.out.println("" + pq);

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println("" + ad);
        ad.addFirst(5);//insert data using front end
        ad.addLast(40);//insert data using rear end
        System.out.println("" + ad);

    }
}
