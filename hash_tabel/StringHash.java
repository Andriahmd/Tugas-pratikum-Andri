package hash_tabel;

import java.util.LinkedList;


public class StringHash {
    
    
    private LinkedList<String>[] table; // araay yg dipakai untuk menyimpan data 

    // code untuk membuat string hash dengn ukuran size
    public StringHash(int size) {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    //fungsi hash untk menghitung index dari string
    public int hashFunction(String key) {
        return key.charAt(0) % table.length;
    }

    //perintah untuk menambah string ke dalam hashtable
    public void insert(String value) {
        int index = hashFunction(value); // Hitung indeks
        table[index].add(value); // menambhkan index
        System.out.println("Data "+value+" ditambahkan di index: "+index);
    }

     //perintah untuk mencari string yang ada di hashtble
    public int search(String value) {
        int index = hashFunction(value); // Hitung indeks
        return index; // Cek apakah nilai index
    }

   
    public static void main(String[] args) {
         // Membuat hash dengan ukuran 26 (A-Z)
        StringHash stringHash = new StringHash(26);
        
        //tambahkan beberapa stirng ke hashtable
        stringHash.insert("Kucing"); 
        stringHash.insert("Ayam"); 
        stringHash.insert("Kelinci");
        
        //memcari sring kelinci dan mencetak indexnya
        System.out.println("String Kelinci ditemukan di index: " + stringHash.search("Kelinci")); 
      
    }
}
