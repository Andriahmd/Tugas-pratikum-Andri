package tugas_tree;  // Package untuk pengelompokan kode

import java.util.LinkedList;  // Import kelas LinkedList untuk queue
import java.util.Queue;      // Import kelas Queue untuk representasi antrian

class Node {  // Kelas untuk mewakili node dalam tree
    int data;  // Data yang disimpan dalam node
    Node left;  // Pointer ke child kiri
    Node right; // Pointer ke child kanan

    public Node(int data) {  // Konstruktor untuk membuat node
        this.data = data;
        left = null;
        right = null;
    }
}

public class Tugas {  // Kelas utama untuk menjalankan program

    // Metode untuk mencetak tree secara visual
    static void printTree(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.data);
            if (root.left != null || root.right != null) {
                printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
                printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
            }
        }
    }

    // Metode untuk traversal tree dengan urutan pre-order (root-kiri-kanan)
    static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + ", ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // Metode untuk traversal tree dengan urutan in-order (kiri-root-kanan)
    static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + ", ");
        inOrderTraversal(root.right);
    }

    // Metode untuk traversal tree dengan urutan post-order (kiri-kanan-root)
    static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + ", ");
    }

    // Metode untuk traversal tree dengan urutan level-order (level demi level)
    static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();  // Buat queue untuk menyimpan node
        queue.add(root);  // Masukkan root ke queue

        while (!queue.isEmpty()) {  // Selama queue tidak kosong
            Node current = queue.poll();  // Ambil node pertama dari queue
            System.out.print(current.data + ", ");  // Cetak data node

            // Masukkan child kiri dan kanan ke queue untuk diproses nantinya
            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
        public static void main(String[] args) {
            // perintah untuk memasukan root 1
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            root.left.left.left = new Node(8);
            root.left.right.left = new Node(9);
            root.right.left.left = new Node(10);
            
             // Cetak tree dan traversal ke layar
            System.out.println("Program ke-2");
            System.out.println("\nModel Struktur folder:");
            printTree(root, "", true);
            
            // perintah untuk mencetak traversal tree dengan urutan pre-order
            System.out.println("\nPreOrder: ");
            preOrderTraversal(root);
             // perintah untuk mencetak traversal tree dengan urutan in-order
            System.out.println("\nInOrder: ");
            inOrderTraversal(root);
            // perintah untuk mencetak traversal tree dengan urutan post-order
            System.out.println("\nPostOrder");
            postOrderTraversal(root);
             // perintah untuk mencetak traversal tree dengan urutan level-order  
            System.out.println("\nLevelOrder");
            levelOrder(root);
            
            // perintah untuk memasukan root 2
            Node root2 = new Node(50);
            root2.left = new Node(30);
            root2.right = new Node(70);
            root2.left.left = new Node(10);
            root2.left.right = new Node(35);
            root2.right.left = new Node(65);
            root2.right.right = new Node(80);
            
            // Cetak tree dan traversal ke layar
            System.out.println("\nProgram ke-3");
            System.out.println("\n\nModel Struktur folder:");
            printTree(root2, "", true);
             // perintah untuk mencetak traversal tree dengan urutan pre-order
            System.out.println("PreOrder: ");
            preOrderTraversal(root2);
            // perintah untuk mencetak traversal tree dengan urutan in-order
            System.out.println("\nInOrder: ");
            inOrderTraversal(root2);
            // perintah untuk mencetak traversal tree dengan urutan post-order
            System.out.println("\nPostOrder");
            postOrderTraversal(root2);
             // perintah untuk mencetak traversal tree dengan urutan level-order
            System.out.println("\nLevelOrder");
            levelOrder(root2);
    
}
    }
