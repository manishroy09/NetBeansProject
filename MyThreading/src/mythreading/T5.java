/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreading;

//Example of getName and setName of thread
/**
 *
 * @author manis
 */
public class T5 implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread : " + Thread.currentThread().getName());
        }
    }

    public void start() {
        System.out.println("This is Start method overriden");

    }

    public static void main(String[] args) {
        Thread t5 = new Thread(new T5());
        t5.setName("Cybrom Thread ");
        t5.start();
       

        //t1.run();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread : " + Thread.currentThread());
        }
    }
}
