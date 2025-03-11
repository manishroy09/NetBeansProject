/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

import javafx.beans.binding.Bindings;
/**
 *
 * @author manis
 */
public class MergeSortDemo {
    public static void conquer(int arr[], int si, int mid, int ei){
        int size = ei-si+1;
        int merged[]= new int[size];
        int idx1 = si;
        
        int idx2= mid+1;
        int x=0; // x represent merged array 
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]>=arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx2<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        //copy the data into original array
        for(int i1=0, j1=si; j1<size; i1++, j1++){
        arr[j1]=merged[j1];
    }
  }
    
    public static void divide(int arr[], int si, int ei){
        if(si>=ei){   // base condition
            return;  
        }
        int mid=(si+ei)/2;
        divide(arr, si, mid); // for left sub array
        divide(arr, mid+1, ei); // for rigth sub array
        conquer(arr, si, mid, ei);
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 50, 40, 5};
        System.out.println("Print Before Sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print("\t"+arr[i]);
        }
        divide(arr,0,arr.length-1);
         System.out.println("\nPrint After Sorting");
        for(int i=0; i<arr.length; i++){
            System.out.print("\t"+arr[i]);
        }
    }
}
    
