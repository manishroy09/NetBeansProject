/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manis
 */
public class Display {
    public synchronized void wish(String name){
        System.out.println("=====> Good Evening ======>");
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(" "+name);
            } catch (InterruptedException ex) {
                Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
