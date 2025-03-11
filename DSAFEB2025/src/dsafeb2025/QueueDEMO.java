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
public class QueueDEMO {
    static int  Q[] = new int[6];
    static int front = -1;
    static int rear = -1;
    public static boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public static boolean isFull(){
        return rear == Q.length-1;
    }
    public static void enq(int data){
        //Step1: first check over flow condition
        if(isFull()){
            System.out.println("This over flow condition");
        }else if(isEmpty()){
            //Step2: To check queue is Empty increase front and rear by 1;
            front++;
            rear++;
            Q[rear] = data;
            System.out.println("First Element Inseert into the queue");
        }else{
            rear++;
            Q[rear] = data;
            System.out.println("Data Insert after first Element");
       
        //step3: if queue is not empty then increase only rear
        //Step 4: insert data into queue
        }
     
    }
    public static int deq(){
        int r=0;
        //Step1:check under flow condition 
        if(isEmpty()){
            System.out.println("Under flow condition");
        }else if(rear==front){
            //Step2: To check queue contains only one element so value of front assign into another variable then front and rear is -1
            r = Q[front];
            front = -1;
            rear = -1;
            System.out.println("only one element was there");
        }else{
            //step3: if queue  contain more than  one element
            r = Q[front];
            front++;
            System.out.println("Delete element from the queue");
        }
        //Step4: Return result
        return r;
    }
    public static int peek(){
        int r=-1;
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            r=Q[front];
        }
        return r;
    }
    public static void main(String[] args) {
        enq(10);
       enq(20);
       enq(30);
       enq(40);
       enq(50);
       enq(60);
       enq(70);
       
        System.out.println("Deleted Element from the Queue : "+deq());
        System.out.println("Deleted Element from the Queue : "+deq());
        System.out.println("Front ======> Element "+peek());
        System.out.println("Deleted Element from the Queue : "+deq());
        System.out.println("Deleted Element from the Queue : "+deq());
        System.out.println("Deleted Element from the Queue : "+deq());
        System.out.println("Deleted Element from the Queue : "+deq());
        System.out.println("Deleted Element from the Queue : "+deq());
    }
    
}
