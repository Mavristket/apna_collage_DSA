import java.util.*;

public class lowest_comman_anccenter2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data; // Added initialization
            this.left = null;
            this.right = null;
        }
    }

    public static Node Lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca = Lca(root.left, n1, n2);
        Node rightlca = Lca(root.right, n1, n2);

        if (leftlca == null) {
            return rightlca;
        }
        if (rightlca == null) {
            return leftlca;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Node result = Lca(root, 2, 2);
        if (result != null) {
            System.out.print(result.data); // Prints: 2
        }
    }
}
