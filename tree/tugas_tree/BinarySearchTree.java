package tugas_tree;  // Mendeklarasikan package untuk pengelompokan kode

import java.util.LinkedList;  // Mengimport kelas LinkedList untuk queue
import java.util.Queue;  // Mengimport kelas Queue untuk representasi antrian
// Kelas untuk mewakili node dalam binary search tree
class Node {  
    String data;  // Data yang disimpan dalam node
    Node left;  // Pointer ke child kiri
    Node right;  // Pointer ke child kanan
}


public class BinarySearchTree {

    Node root;  // Root node dari tree

    // Perintah untuk menambahkan node baru ke tree
    void tambahNode(String dataBaru) {
        root = tambahNodeHelp(root, dataBaru);
    }

    // Metode helper untuk menambahkan node baru secara rekursif
    Node tambahNodeHelp(Node root, String dataBaru) {
        // Jika root kosong, buat node baru
        if (root == null) {
            Node baru = new Node();
            baru.data = dataBaru;
            baru.left = null;
            baru.right = null;
            return baru;
        }

        // Bandingkan data baru dengan data root
        int hasilCompare = dataBaru.compareTo(root.data);

        // Jika data baru lebih kecil, sisipkan ke subtree kiri
        if (hasilCompare < 0) {
            root.left = tambahNodeHelp(root.left, dataBaru);
        } else if (hasilCompare > 0) { // Jika data baru lebih besar, sisipkan ke subtree kanan
            root.right = tambahNodeHelp(root.right, dataBaru);
        }

        return root;
    }
 // Metode untuk menambahkan child node ke node yang sudah ada
 void tambahChild(String existingData, String newData) {
    root = tambahChildHelp(root, existingData, newData);
}

// Metode helper untuk menambahkan child node secara rekursif
Node tambahChildHelp(Node root, String existingData, String newData) {
    // Jika root kosong, kembalikan null
    if (root == null) {
        return root;
    }

    // Jika menemukan node yang sesuai dengan existingData, tambahkan child baru
    if (root.data.equals(existingData)) {
        Node childNode = new Node();
        childNode.data = newData;
        childNode.left = null;
        childNode.right = null;

        // Sisipkan child node sebagai anak kiri dari node yang ditemukan
        childNode.left = root.left;
        root.left = childNode;
    } else {
        // Lanjutkan pencarian di subtree kiri dan kanan
        root.left = tambahChildHelp(root.left, existingData, newData);
        root.right = tambahChildHelp(root.right, existingData, newData);
    }

    return root;
}

// Metode untuk menampilkan tree secara visual
public static void displayTree(Node root, String prefix) {
    if (root != null) {
        System.out.println(prefix + "├── " + root.data);
        displayTree(root.left, prefix + "│   "); // Sisipkan garis untuk visualisasi
        displayTree(root.right, prefix + "│   ");
    }
}

// Metode untuk traversal tree dengan urutan pre-order
static void preOrderTraversal(Node root) {
    if (root == null) {
        return; // Jika root kosong, kembalikan
    }

    System.out.print(root.data + ", ");
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
}

// Metode untuk traversal tree dengan urutan in-order
static void inOrderTraversal(Node root) {
    if (root == null) {
        return; // Jika root kosong, kembalikan
    }
       // Kunjungi subtree kiri terlebih dahulu
    inOrderTraversal(root.left);

    // Kunjungi root setelah subtree kiri
    System.out.print(root.data + ", ");

    // Kunjungi subtree kanan setelah root
    inOrderTraversal(root.right);
}

// Metode untuk traversal tree dengan urutan post-order
static void postOrderTraversal(Node root) {
    if (root == null) {
        return; // Jika root kosong, kembalikan
    }

    // Kunjungi subtree kiri dan kanan terlebih dahulu
    postOrderTraversal(root.left);
    postOrderTraversal(root.right);

    // Kunjungi root setelah subtree kiri dan kanan
    System.out.print(root.data + ", ");
}

// Metode untuk traversal tree dengan urutan level-order
static void levelOrder(Node root) {
    Queue<Node> queue = new LinkedList<>(); // Buat queue untuk menyimpan node
    queue.add(root); // Masukkan root ke queue

    while (!queue.isEmpty()) { // Selama queue tidak kosong
        Node current = queue.poll(); // Ambil node pertama dari queue
        System.out.print(current.data + ", "); // Cetak data node

        // Masukkan child kiri dan kanan ke queue untuk diproses nantinya
        if (current.left != null) {
            queue.add(current.left);
        }

        if (current.right != null) {
            queue.add(current.right);
        }
        }
    }
}