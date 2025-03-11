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
public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
        System.out.println("Node created Success");
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print("======>" + temp.data);
            temp = temp.next;
        }
    }
    public Node addNodeAtStart(Node head, int data){
        //Step1: Create a new Node
        Node newNode = new Node(data);
        //Step2: Make point newNode to current Node
        newNode.next = head;
        // Step3: Update head
        head = newNode;
        //Step4: return new head
        return head;
    }
    public void addNewNodeAtEnd(Node head, int data){
            //Step1: Create new Node 
            Node newNode = new Node(data);
            //Step2: Traverse the list
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            //step3: Setting the last node next pointer to th new node
            temp.next = newNode;
    }
    
    public void addNewNodeatpos(Node head, int data, int pos){
        //step1: create new node
        Node newNode = new Node(data);
        //Step2:  Traverse the list upto specified position
        Node temp1 = head;
        Node temp2 = head.next;
        pos--;
        while(pos>1){
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos--;
        }
        temp1.next = newNode;
        newNode.next = temp2;
    }
    public boolean isEmpty(Node head){
        return head==null;
    }
    public Node deleteFirstNode(Node head){
        //step1: Check the list is empty 
        if(isEmpty(head)){
            System.out.println("List is Empty");
        }else{
            //step2: Store head into temporary variable 
            Node temp = head;
            //step3: move head to the next node
            head = head.next;
            //step4: free memory of the temporary variable
            temp = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        // Head pint th first node of singly Linked list
        Node head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        System.out.println("Print data of Singly Linked List");
        System.out.println("===>" + first.data + "===>" + second.data + "===>" + third.data + "===>" + forth.data);
        System.out.println("Print data of Singly Linked List Using head");
        System.out.print("===>" + head.data);
        System.out.print("===>" + head.next.data);
        System.out.print("===>" + head.next.next.data);
        System.out.print("===>" + head.next.next.next.data);
        System.out.println("Print Data of Singly linked list using metod ");
        head.display(head);
        
        head = head.addNodeAtStart(head, 5); 
        System.out.println("\nPrint Data after new Node at startin in singly linked list");
        head.display(head);
        
        System.out.println("\nPrint Data after add new Node at end of singly linked list");
        head.addNewNodeAtEnd(head, 50);
        head.display(head);
        System.out.println("\nPrint data after add new node at specific position\n");
       head.addNewNodeatpos(head, 35, 5);
       head.display(head);
       
       head = head.deleteFirstNode(head);
        System.out.println("\nPrint data of singly linked list Afte deletion first node\n");
        head.display(head);
    }
    
}
