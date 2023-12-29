package hash_tabel;


public class StepHash {
    
    
    private int[] table; // araay yg dipakai untuk menyimpan data 

   
    private int step = 1; // ukuran step (langkah)

    // code untuk menginisialisaikan aray
    public StepHash(int size) {
        table = new int[size];
    }

    // perintah untuk menyisipkan data
    public void insert(int value) {
        // code untuk menghitung indeks hash
        int index = value % table.length; 

         // code untuk mencari indeks kosong
        while (table[index] != 0) {
            System.out.println("Terjadi double key : "+ index);
            index = (index + step) % table.length; 
            System.out.println("Index di geser ke: "+index);
        }
        table[index] = value; 
        System.out.println("Data dimasukan ke dalam index : "+index);
    }

   
     // perintah untuk mencari data di tabel hash
    public int search(int value) {
        int index = value % table.length; 
        while (table[index] != 0) {
            if (table[index] == value) {
                return index; 
            }
            index = (index + step) % table.length; 
        }
        return -1; // Jika data tidak ditemukan, mengembalikan -1
    }

   
    public static void main(String[] args) {
        // Inisialisasi Step Hash dengan ukuran array 10
        StepHash stepHash = new StepHash(10);

        // Memasukan beberapa nilai
        stepHash.insert(9);
        stepHash.insert(9);
        stepHash.insert(8);
        stepHash.insert(50);

        // perintah untuk mencari nilai hash
        System.out.println("Hasil pencarian nilai 9 di Index: " + stepHash.search(9));  
        System.out.println("Hasil pencarian nilai 50 di Index: " + stepHash.search(50));
        System.out.println("Hasil pencarian nilai 8 di Index: " + stepHash.search(8));  
        // jika nilai ditemukan maka nilai akan di kembalikan 
        
        
        System.out.println("Hasil pencarian nilai 200 di Index: " + stepHash.search(200)); 
         // karna nilai tidak ditemukan maka mengembalikan -1 
    }
}




