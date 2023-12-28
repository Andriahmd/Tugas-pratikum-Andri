package Sorting_java;

public class InsertionSort {
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {7,3,9,2,12,10,15};    
        System.out.println("Data Sebelum dilakukan insertion sort ");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("Data Sesudah dilakukan insertion sort ");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }      
}
