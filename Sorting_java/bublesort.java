package Sorting_java;

public class bublesort {
    public static void bublesort(int arr []){
        int a = arr.length;
        for ( int i= 0; i < a-1; i++){
        for (int j = 0; j < a-i-1; j++){

            // memasukan nilai di sort java 
            if(arr[ j] > arr[j + 1]){
                int nilai = arr[j];
                arr[j] = arr [j+1];
                arr[j + 1] = nilai;
            }
        }
        }
    }

    // fungsi array 
    public static void printArray(int [] arr) {
        for (int value : arr){
            System.out.println(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try{
            int[] data ={44,33,55,22,11};
            System.out.println("Data seblum di sort: ");
            printArray(data);
            bublesort(data);
            System.out.println("data sesudah di sort: ");
            printArray(data);
        }
        catch(Exception e) {
        System.out.println(" Terjadi eror system !!!" + e.getMessage());
        }
    }   
}
