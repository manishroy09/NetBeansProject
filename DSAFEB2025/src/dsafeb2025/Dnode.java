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
public class Dnode {
    Dnode prev;
    int data;
    Dnode next;

    public Dnode(int data){
        prev=null;
        this.data=data;
        next=null;
        System.out.println("Node Created in Doubly Linkend list");
    }
      public void display(Dnode head) {
        Dnode temp = head;
        while (temp != null) {
            System.out.print("======>" + temp.data);
            temp = temp.next;
        }
    }
    public Dnode addNodeAtStart(Dnode head, int data){
    //Step1: Create a new Node
        Dnode newNode = new Dnode(data);
        //Step2: Make point newNode to current Node
        head.prev=newNode;
        newNode.next = head;
         newNode.prev = null;
        // Step3: Update head
        head = newNode;
        //Step4: return new head
        return head;
}
    public void printForwardData(Dnode head){
        Dnode temp = head;
        while(temp!=null){
            System.out.print("===>"+temp.data);
            temp = temp.next;
        }
    }
    
    public void printBackwordData(Dnode tail){
        Dnode temp = tail;
        while(temp!=null){
            System.out.print("===>"+temp.data);
            temp = temp.prev;
        }
    }
    
    
    public static void main(String[] args) {
        Dnode f1=new Dnode(10);
        Dnode f2=new Dnode(20);
        Dnode f3=new Dnode(30);
        Dnode f4=new Dnode(40);
        f1.next = f2;
        f2.prev = f1;
        
        f2.next = f3;
        f3.prev = f2;
        
        f3.next = f4; 
        f4.prev = f3;
        
        Dnode  head=f1;
        Dnode tail = f4;
        System.out.println("Print data of doubly linked list in forward direction");
        head.printForwardData(head);
        
        System.out.println("\nPrint data of  doubly linked list in backword direction");
        head.printBackwordData(tail);
        
        
        System.out.println("\nPrint data aftera adding new node at start");
            head = head.addNodeAtStart(head, 5);
            head.display(head);
    }
    
    
}
