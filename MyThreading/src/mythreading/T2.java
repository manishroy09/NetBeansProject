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
public class T2 implements Runnable {
    public void run(){
          for(int i=0; i<=5; i++){
            System.out.println("Child Thread : " +i);
        }
    }
    
    public static void main(String[] args) {
        Thread t2 = new Thread(new T2());
        t2.start();
        
        for(int i=0; i<=5; i++){
            System.out.println("Main Thread : " +i);
        }
    }
}
