import java.util.*;

public class BST_to_balenced_tree {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Fixed: Changed parameter from int arr[] to ArrayList<Integer>
    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    // Added: Missing insert method to build the initial unbalanced BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void getinorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
    }

    public static Node balencestree(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root, inorder);
        return createBST(inorder, 0, inorder.size() - 1);
    }

    // Optional: Helper method to verify the tree balance structure visually
    public static void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
        
        root = balencestree(root);
        System.out.println("Balanced BST created from the given BST.");
        
        System.out.print("Preorder traversal of balanced tree: ");
        preorderTraversal(root);
    }
}
