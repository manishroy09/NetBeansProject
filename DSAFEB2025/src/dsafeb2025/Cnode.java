/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

/**
 *
 * @author manis
 */
public class Cnode {
       int data;
    Cnode next;

    public Cnode(int data){
       
        this.data=data;
        next=null;
        System.out.println("Node Created in circular linked list");
    }
    public void displayData(Cnode head){
        Cnode temp = head;
        do{
            System.out.print("===>"+temp.data);
            temp = temp.next;
        }while(temp!=head);
    }
   
    public static void main(String[] args) {
        Cnode f1=new Cnode(10);
        Cnode f2=new Cnode(20);
        Cnode f3=new Cnode(30);
        f1.next = f2;
        f2.next = f3;
        f3.next = f1;
        Cnode head = f1;
      
        
        System.out.println("\nPrint data of  circular singly linked list");
        head.displayData(f3);
    }
    
    
}


