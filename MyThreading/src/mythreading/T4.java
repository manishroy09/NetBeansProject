/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreading;


// Overriding start method 

/**
 *
 * @author manis
 */
public class T4 implements Runnable{

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread : " + i);
        }
    }

    public void start() {
        System.out.println("This is Start method overriden");

    }

    public static void main(String[] args) {
        Thread t4 = new Thread(new T4());
        // t1.start();
        //t1.run();

        T4 obj = new T4();
        obj.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread : " + i);
        }
    }
}
