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
public class Bsort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]  = arr[j];
                    arr[j] = temp;
                    System.out.println("Swapping Performed");
            }
        }
            System.out.println("Number of pass"+i);
    }
  }
    public static void main(String[] args) {
        int arr[] = {5,3,8,4,6};
        
        System.out.println("sorted data before sorting : \n");
        for(int x : arr){
            System.out.print("\t"+ x);
        }
        bubbleSort(arr);
          System.out.println("\nsorted data after sorting : \n");
        for(int x : arr){
            System.out.print("\t" +x);
        }
    }
}
