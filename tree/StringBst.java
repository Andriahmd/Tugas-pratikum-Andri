import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//class node
class Node {
    String value;// nilai yang akan di simpan di node
    Node left; // node kiri
    Node right; //node kanan

    //konstruktor  untuk membuat node
    public Node(String value) { 
        this.value = value;
        left = null;
        right = null;
    }
}

//class stringbst
class StringBst {
    Node root;

    //konstruktor strinbst
    public StringBst() {
        root = null;
    }

   

     // perintah untuk menjalankan metode menambah / menyisipkan node baru ke tree
    public Node insert(Node root, String value) {
        if (root == null) {
            root = new Node(value); //node saat ini
            return root; 
        }

        
        if (value.compareTo(root.value) < 0) {
            root.left = insert(root.left, value);
        } else if (value.compareTo(root.value) > 0) {
            root.right = insert(root.right, value);
        }

        return root;
    }

  
    // perintah untuk menjalakan metode preorder
    public void preorder(Node root) {  
        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.left);   //kunjungi root,kiri dan kanan
            preorder(root.right);
        }
    }

   
    //perintah untuk menjalakan metode inorder
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);  //kunjungi kiri,root,kanan//
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    
    //perintah untuk menjalakan metode postirder
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left); //kunjungi kiri,kanan,root
            postorder(root.right);
            System.out.print(root.value + " ");
        }
    }

   
    // perintah untuk menjalakan metode level order
    public void levelOrder(Node root) {
        if (root == null) return;

        // kunjungi level per level
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        
    }

   
     // Metode untuk mencetak struktur pohon secara visual
    public void printTree(Node node, String prefix, boolean isTail) {
        if (node != null) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + node.value);
            List<Node> children = new ArrayList<>();
            if (node.left != null) children.add(node.left);
            if (node.right != null) children.add(node.right);
            for (int i = 0; i < children.size() - 1; i++) {
                printTree(children.get(i), prefix + (isTail ? "    " : "│   "), false);
            }
            if (children.size() > 0) {
                printTree(children.get(children.size() - 1), prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }

    
    public static void main(String[] args) {
        StringBst tree = new StringBst(); // objek tree

        //perintah untuk menabahkan nilai ke tree
        tree.root = tree.insert(tree.root, "Mango");
        tree.insert(tree.root, "Apple");
        tree.insert(tree.root, "Orange");
        tree.insert(tree.root, "Banana");
        tree.insert(tree.root, "Grapes");
        tree.insert(tree.root, "Pineapple");
        tree.insert(tree.root, "Peach");

        // perintah untuk mencetak struker tree
        System.out.println("Struktur pohon biner:");
        tree.printTree(tree.root, "", true);

        //mecetak tree
        System.out.println("Traversal pre-order:");
        tree.preorder(tree.root);

        System.out.println("\nTraversal in-order:");
        tree.inorder(tree.root);

        System.out.println("\nTraversal post-order:");
        tree.postorder(tree.root);

        System.out.println("\nTraversal level-order:");
        tree.levelOrder(tree.root);
    }
}