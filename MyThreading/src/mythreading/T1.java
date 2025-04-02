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
public class T1 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child  Thread " + i);
        }
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        T1 t1 = new T1();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread " + i);
        }
    }

}
