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
    public static int getdist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist=getdist(root.left,n);
        int rightdist=getdist(root.right,n);

        if(leftdist==-1 && rightdist==-1){
            return-1;
        }else if(leftdist==-1){
            return rightdist+1;
        }else{
            return leftdist+1;
        }
    }
    public static int mindis(Node root,int n1,int n2){
        Node lca=Lca(root,n1,n2);
        return getdist(lca,n1)+getdist(lca,n2);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Node result = Lca(root, 2, 2);
        if (result != null) {
            System.out.print(result.data); // Prints: 2
        }
        System.out.print(mindis(root,2,3));
    }
}
