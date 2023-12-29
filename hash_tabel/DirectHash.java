package hash_tabel;

public class DirectHash {
   
    private int[] table;

    //  perintah untuk membuat array  dengan ukuran (size)
    public DirectHash(int size) {
        table = new int[size];
    }
     // metode yang di gunakan untuk menyisipkan ( insert) ke dalam
    public void insert(int value) {
        table[value] = value; // Gunakan nilai sebagai kunci (indeks)
        System.out.println("Data: "+value+" dimasukan ke index: "+ value);
    }

     //metode untuk mencari nilai yang ada di dalam data(hashtable)
    public int search(int value) {
        if (table[value] == value) { //perintah untuk memeriksa nilai pada index 
            return table[value]; // Kembalikan nilai jika ditemukan
        }
        return -1; // Tidak ditemukan
    }

   
    public static void main(String[] args) {
        // Inisialisasi Direct Hash dengan ukuran array 200
        DirectHash directHash = new DirectHash(200);

        // perintah untuk menambahkan nilai
        directHash.insert(9);
        directHash.insert(50);
        directHash.insert(100);

        // perintah untuk mencari nilai directhash
        System.out.println("Hasil pencarian nilai 9 di Index: " + directHash.search(9));  
        System.out.println("Hasil pencarian nilai 50 di Index: " + directHash.search(50)); 
        System.out.println("Hasil pencarian nilai 100 di Index: " + directHash.search(100));
        // jika nilai ditemukan maka nilai akan di kembalikan 

        System.out.println("Hasil pencarian nilai 150 di Index: " + directHash.search(150));
          // karna nilai tidak ditemukan maka mengembalikan -1 
    }
}