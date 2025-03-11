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
public class Cdnode {
    Cdnode prev;
    int data;
    Cdnode next;

    public Cdnode(int data){
        prev=null;
        this.data=data;
        next=null;
        System.out.println("Node Created in circular doubly Linkend list");
    }
    public void printForwardData(Cdnode head){
        Cdnode temp = head;
        do{
            System.out.print("===>"+temp.data);
            temp = temp.next;
        }while(temp!=head);
    }
    
    public void printBackwordData(Cdnode tail){
        Cdnode temp = tail;
        do{
            System.out.print("===>"+temp.data);
            temp = temp.prev;
        }while(temp!= tail);
    }
    
    
    public static void main(String[] args) {
        Cdnode f1=new Cdnode(10);
        Cdnode f2=new Cdnode(20);
        Cdnode f3=new Cdnode(30);
      
        f1.next = f2;
        f2.prev = f1;
        
        f2.next = f3;
        f3.prev = f2;
       
        f3.next = f1;
        f1.prev = f3;
        
        Cdnode  head=f1;
        Cdnode tail = f3;
        System.out.println("Print data of Circular linked list in forward direction");
        head.printForwardData(head);
        
        System.out.println("\nPrint data of  Circular  linked list in backword direction");
        head.printBackwordData(tail);
    }
    
    
}
