package Sorting_java;

public class TugasSort {
    public static void main(String[] args) {
        // Perintah untuk membuat array berisi nama buah
        String[] buah = { "banana", "apple", "orange", "grape", "kiwi" };
        
        // Perintah untuk memanggil metode sort untuk mengurutkan array buah
        sort(buah);
        // perintah untuk mencetak array buah setelah diurutkan
        for (String string : buah) {
            System.out.println(string);

        }
    }

    // perintah memanggil Metode untuk melakukan sorting array string secara ascending
    static void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  // Loop luar untuk iterasi elemen array
            for (int j = 0; j < arr.length - i - 1; j++) {  // Loop dalam untuk membandingkan elemen
                if (arr[j].compareTo(arr[j + 1]) > 0) {

                    // Swap arr[j] and arr[j+1]

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
