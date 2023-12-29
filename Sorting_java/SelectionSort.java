package Sorting_java;

public class SelectionSort {

    //  perintah untuk menjalankan program 
    public static void main(String[] args) {
        int [] arr= {22,2,90,25,20,30,6,3}; // Membuat array dengan nilai awal
        // perintah untuk Memanggil metode SelectionSort untuk mengurutkan array
        SelectionSort(arr);
        System.out.println("Data array yang sudah di selection sort ");
         // Loop untuk mencetak elemen array setelah diurutkan
        for (int i : arr){     
            System.out.println(i +"");
        }
    }

    // di gunakan untuk meluping data sesuai kondisi

    public static void SelectionSort(int []arr ) {
        int n = arr.length;
        for(int i =0; i < n-1; i++ ){
            int MinIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[MinIdx]) {
                    MinIdx = j;
                }
            }
            // Perintah untuk  menukar posisi elemen terkecil dengan elemen di posisi i
            int Nilai = arr[MinIdx];
            arr[MinIdx] = arr[i];
            arr[i] = Nilai;
        }
    }      
}
