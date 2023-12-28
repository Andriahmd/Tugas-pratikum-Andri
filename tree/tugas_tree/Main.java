package tugas_tree;
public class Main {
        public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();
    
            tree.tambahNode("Mango");
            tree.tambahNode("Apple");
            tree.tambahNode("Orange");
            tree.tambahChild("Apple","Banana");
    
            tree.tambahChild("Orange", "Grapes");
            tree.tambahNode("Pineapple");
            tree.tambahChild("Pineapple", "Peach");
    
            System.out.println("\nTree:");
            tree.displayTree(tree.root, "");
    
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

