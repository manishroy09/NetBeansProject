/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreading;

// Overload run method 
/**
 *
 * @author manis
 */
public class T3 implements Runnable{

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread : " + i);
        }
    }

    public void run(int x) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread : " + i);
        }

    }

    public static void main(String[] args) {
        Thread t3 = new Thread();
        // t1.start();
        //t1.run();
        T3 obj = new T3();
        obj.run(10);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread : " + i);
        }
    }
}
