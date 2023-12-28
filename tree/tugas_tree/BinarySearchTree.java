package tugas_tree;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    String data;
    Node left;
    Node right;
}

public class BinarySearchTree {

    Node root;

    void tambahNode(String dataBaru) {
        root = tambahNodeHelp(root, dataBaru);
    }

    Node tambahNodeHelp(Node root, String dataBaru) {
        if (root == null) {
            Node baru = new Node();
            baru.data = dataBaru;
            baru.left = null;
            baru.right = null;
            return baru;
        }

        int hasilCompare = dataBaru.compareTo(root.data);

        if (hasilCompare < 0) {
            root.left = tambahNodeHelp(root.left, dataBaru);
        } else if (hasilCompare > 0) {
            root.right = tambahNodeHelp(root.right, dataBaru);
        }

        return root;
    }

    void tambahChild(String existingData, String newData) {
        root = tambahChildHelp(root, existingData, newData);
    }

    Node tambahChildHelp(Node root, String existingData, String newData) {
        if (root == null) {
            return root;
        }

        if (root.data.equals(existingData)) {
            Node childNode = new Node();
            childNode.data = newData;
            childNode.left = null;
            childNode.right = null;

            childNode.left = root.left;
            root.left = childNode;
        } else {
            root.left = tambahChildHelp(root.left, existingData, newData);
            root.right = tambahChildHelp(root.right, existingData, newData);
        }

        return root;
    }

    public static void displayTree(Node root, String prefix) {
        if (root != null) {
            System.out.println(prefix + "├── " + root.data);
            displayTree(root.left, prefix + "│   ");
            displayTree(root.right, prefix + "│   ");
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
}