package Sorting_java;
// Mendeklarasikan kelas bernama bublesort
public class bublesort {
    // perintah untuk melakukan bubble sort
    public static void bublesort(int arr []){ 
        int a = arr.length; // perintah untuk menyimpan panjang array
        for ( int i= 0; i < a-1; i++){
        for (int j = 0; j < a-i-1; j++){

            // memasukan nilai di sort java 
            if(arr[ j] > arr[j + 1]){
                // Jika elemen saat ini lebih besar, tukar posisinya
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

// Metode utama untuk menjalankan program
    public static void main(String[] args) {  
        try {  // perintah untuk menjalankan kode dan menangkap error jika terjadi
            int[] data = {44, 33, 55, 22, 11};  // Membuat array berisi data untuk disortir
            System.out.println("Data sebelum di sort: ");
            printArray(data);  // Mencetak array sebelum disortir
            bublesort(data);  // Memanggil metode bubblesort untuk mengurutkan array
            System.out.println("Data sesudah di sort: ");
            printArray(data);  // Mencetak array setelah disortir
        } catch (Exception e) {  // Menangkap error jika terjadi
            System.out.println("Terjadi error sistem !!!" + e.getMessage());
        }
    }   
}
