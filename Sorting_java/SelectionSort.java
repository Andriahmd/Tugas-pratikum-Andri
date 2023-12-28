package Sorting_java;

public class SelectionSort {
 
    public static void main(String[] args) {
        int [] arr= {22,2,90,25,20,30,6,3};
        SelectionSort(arr);
        System.out.println("Data array yang sudah di selection sort ");
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

            int Nilai = arr[MinIdx];
            arr[MinIdx] = arr[i];
            arr[i] = Nilai;
        }
    }      
}
