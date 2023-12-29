package Sorting_java;

 // perintah untuk melakukan insertion sort
public class InsertionSort {
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  // Loop luar untuk iterasi elemen array (mulai dari elemen kedua)
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  // Selama i masih dalam jangkauan array dan elemen sebelumnya lebih besar dari key

                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]) {  
        // Membuat array berisi data untuk disortir
        int[] arr1 = {7, 3, 9, 2, 12, 10, 15};  
        System.out.println("Data Sebelum dilakukan insertion sort");
        // Loop untuk mencetak array sebelum diurutkan
        for (int i : arr1) {  
            System.out.print(i + " ");
        }
        System.out.println();  // Memberikan baris baru

        insertionSort(arr1);  // Memanggil metode insertionSort untuk mengurutkan array

        System.out.println("Data Sesudah dilakukan insertion sort");
        // Loop untuk mencetak array setelah diurutkan
        for (int i : arr1) {  
            System.out.print(i + " ");  
        }    
    }      
}
