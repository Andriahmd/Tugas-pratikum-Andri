package tugas_tree;
import java.util.LinkedList;
    import java.util.Queue;
    
    
    class Node {
        int data;
        Node left;
        Node right;
    
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    public class Tugas {
        
        static void printTree(Node root, String prefix, boolean isLeft) {
            if (root != null) {
                System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.data);
                if (root.left != null || root.right != null) {
                    printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
                    printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
                }
            }
        }
    
        static void preOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
    
            System.out.print(root.data + ", ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    
        static void inOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data + ", ");
            inOrderTraversal(root.right);
        }
    
        static void postOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
    
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + ", ");
        }
    
        static void levelOrder(Node root) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
    
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                System.out.print(current.data + ", ");
    
                if (current.left != null) {
                    queue.add(current.left);
                }
    
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
    }
    
        public static void main(String[] args) {
    
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
            
            System.out.println("Program ke-2");
            System.out.println("\nModel Struktur folder:");
            printTree(root, "", true);
    
            System.out.println("\nPreOrder: ");
            preOrderTraversal(root);
            System.out.println("\nInOrder: ");
            inOrderTraversal(root);
            System.out.println("\nPostOrder");
            postOrderTraversal(root);
            System.out.println("\nLevelOrder");
            levelOrder(root);
    
            Node root2 = new Node(50);
            root2.left = new Node(30);
            root2.right = new Node(70);
            root2.left.left = new Node(10);
            root2.left.right = new Node(35);
            root2.right.left = new Node(65);
            root2.right.right = new Node(80);
            
            System.out.println("\nProgram ke-3");
            System.out.println("\n\nModel Struktur folder:");
            printTree(root2, "", true);
            
            System.out.println("PreOrder: ");
            preOrderTraversal(root2);
            System.out.println("\nInOrder: ");
            inOrderTraversal(root2);
            System.out.println("\nPostOrder");
            postOrderTraversal(root2);
            System.out.println("\nLevelOrder");
            levelOrder(root2);
    
}
    }
