


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
public class iSort {
    public static void insertionSort(int arr[]){
        int i,j,temp;
        for(i=1; i<arr.length; i++){
            temp = arr[i];
            for(j=i-1; j>=0 && arr[j]>temp; j--){
                arr[j+1] =arr[j];
            }
            arr[j+1] = temp;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {10,9,3,4,5,6,8};
        
       System.out.println("Print data before insertion sorting :");
        for(int x : arr){
            System.out.print("\t"+x);
                 }
        insertionSort(arr);
        System.out.println("\nPrint sorted data after insertion sorting");
        for(int x : arr){
            System.out.print("\t"+x);
                 }
    }
}


