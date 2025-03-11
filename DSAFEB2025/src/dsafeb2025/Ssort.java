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
public class Ssort {
//    public static void selectionSort(int arr[]){
//        int n = arr.length;
//        for(int i=0; i<n-1; i++){
//            int minIndex =i;
//            for(int  j=i+1; j<n; j++){
//                if(arr[j]<arr[minIndex]){
//                    minIndex = j;
//                }
//            }
//          int temp = arr[minIndex];
//          arr[minIndex] = arr[i];
//          arr[i] = temp;
//        }
//    
//    }
//    
//    public static void main(String[] args) {
//        int arr[] = {1,9,2,8,3,7,4,6,5};
//        
//        System.out.println("Print data before sorting :");
//        for(int x : arr){
//            System.out.print("\t"+x);
//                 }
//        selectionSort(arr);
//        System.out.println("\nPrint data after sorting");
//        for(int x : arr){
//            System.out.print("\t"+x);
//                 }
//    }
//}
    
 public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex =i;
            for(int  j=i+1; j<n; j++){
                if(arr[j]>arr[minIndex]){
                    minIndex = j;
                }
            }
          int temp = arr[minIndex];
          arr[minIndex] = arr[i];
          arr[i] = temp;
        }
    
    }
    
    public static void main(String[] args) {
        int arr[] = {1,9,2,8,3,7,4,6,5};
        
        System.out.println("Print data before sorting :");
        for(int x : arr){
            System.out.print("\t"+x);
                 }
        selectionSort(arr);
        System.out.println("\nPrint sorted data in descending  order after sorting");
        for(int x : arr){
            System.out.print("\t"+x);
                 }
    }
}
