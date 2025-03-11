/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * @author manis
 */
public class v1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for(int i=1; i<=10; i++){
            v.add(i);
        }
        v.add(10);
        v.add(1);
        System.out.println("Vector elements : "+v);
        System.out.println("Print Data of Vector Using Enumeration");
        Enumeration<Integer> en=v.elements();
        while(en.hasMoreElements()){
            System.out.println("==>"+en.nextElement());
        }
        System.out.println("\nPrint Data of Vector Using Iterator");
        Iterator<Integer> itr=v.iterator();
        while(itr.hasNext()){
            int x=itr.next();
            if(x%2==0){
                System.out.println("---->"+x);
            }else{
                itr.remove();
            }
        }
        System.out.println(""+v);
        ListIterator<Integer> Itr=v.listIterator();
        while(Itr.hasNext()){
            int x=Itr.next();
            System.out.println("|| "+x);
            if(x==10){
                Itr.add(100);
            }
            if(x==4){
                Itr.set(44);
            }
            if(x==8){
                Itr.remove();
            }
        }
        System.out.println("****==>"+v);
    }
}
