package hash_tabel;


    /**
 * Kelas StepHash
 * <p>
 * Implementasi sederhana dari struktur data hash table menggunakan array.
 * Teknik "step hashing" digunakan untuk menangani kolisi.
 * </p>
 */
public class StepHash {
    
    
    private int[] table;

   
    private int step = 1;

    public StepHash(int size) {
        table = new int[size];
    }

    public void insert(int value) {
        int index = value % table.length; 
        while (table[index] != 0) {
            System.out.println("Terjadi double key : "+ index);
            index = (index + step) % table.length; 
            System.out.println("Index di geser ke: "+index);
        }
        table[index] = value; 
        System.out.println("Data dimasukan ke dalam index : "+index);
    }

   
    public int search(int value) {
        int index = value % table.length; 
        while (table[index] != 0) {
            if (table[index] == value) {
                return index; 
            }
            index = (index + step) % table.length; 
        }
        return -1; // Tidak ditemukan
    }

    /**
     * Metode main untuk demonstrasi.
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        // Inisialisasi Step Hash dengan ukuran array 10
        StepHash stepHash = new StepHash(10);

        // Menyisipkan beberapa nilai
        stepHash.insert(9);
        stepHash.insert(9);
        stepHash.insert(8);
        stepHash.insert(50);

        // Mencari nilai
        System.out.println("Hasil pencarian nilai 9 di Index: " + stepHash.search(9));  // Harusnya mengembalikan 9
        System.out.println("Hasil pencarian nilai 50 di Index: " + stepHash.search(50));  // Harusnya mengembalikan 50
        System.out.println("Hasil pencarian nilai 8 di Index: " + stepHash.search(8));  // Harusnya mengembalikan 100

        // Mencari nilai yang tidak ada
        System.out.println("Hasil pencarian nilai 200 di Index: " + stepHash.search(200));  // Harusnya mengembalikan -1 (tidak ditemukan)
    }
}




