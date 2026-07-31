import java.util.*;

public class build_tree {
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

    static class BinaryTree {
        // Move the index tracker to the class level so it persists across recursive calls
        public static int idx = -1;

        public static Node builttree(int nodes[]) {
            idx++; // Increment the index for each node processing
            
            // Check if we outpaced the array bounds or hit a placeholder null marker (-1)
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = builttree(nodes);
            newNode.right = builttree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        // Correct array initialization syntax. 
        // Note: For preorder building, use -1 to signify null child nodes.
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        BinaryTree bt = new BinaryTree();
        Node root = bt.builttree(nodes);
        System.out.print("Root node data: " + root.data); // Fixed missing semicolon
        System.out.println("\nPreorder traversal:");
        bt.preorder(root);
        System.out.println("\nInorder traversal:");
        bt.inorder(root);
        System.out.println("\nPostorder traversal:");
        bt.postorder(root);
    }
}
