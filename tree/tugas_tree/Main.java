package tugas_tree;  // Package untuk pengelompokan kode

public class Main {  // Kelas utama untuk menjalankan program

    public static void main(String[] args) {  // Metode utama
        BinarySearchTree tree = new BinarySearchTree();  // Buat objek tree baru

        // perintah untuk menambahkan node ke tree
        tree.tambahNode("Mango");
        tree.tambahNode("Apple");
        tree.tambahNode("Orange");
        tree.tambahChild("Apple", "Banana");
        tree.tambahChild("Orange", "Grapes");
        tree.tambahNode("Pineapple");
        tree.tambahChild("Pineapple", "Peach");

        // Cetak tree secara visual
        System.out.println("\nTree:");
        tree.displayTree(tree.root, "");

        // Cetak traversal tree dengan urutan berbeda
        System.out.println("\n\nIn-Order Traversal:");
        tree.inOrderTraversal(tree.root);

        System.out.println("\n\nPre-Order Traversal:");
        tree.preOrderTraversal(tree.root);

        System.out.println("\n\nPost-Order Traversal:");
        tree.postOrderTraversal(tree.root);

        System.out.println("\n\nLevel-Order Traversal:");
        tree.levelOrder(tree.root);
    }
}