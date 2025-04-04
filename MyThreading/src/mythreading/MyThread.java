/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreading;

/**
 *
 * @author manis
 */
public class MyThread extends Thread{
    Display d;
    String name;

    public MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
    
    public static void main(String[] args) {
        Display d1 = new Display();
        MyThread t1 = new MyThread(d1, "DHONI");
        MyThread t2 = new MyThread(d1, "VIRAT");
        MyThread t3 = new MyThread(d1, "ROHIT");
        t1.start();
        t2.start();
        t3.start();
        
    }
}
