import java.util.*;
public class mirror_tree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            Node newNode=new Node(val);
            return newNode;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node left=mirror(root.left);
        Node right=mirror(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args){
        int arr[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        System.out.println("Original tree (inorder):");
        inorder(root);
        root=mirror(root);
        System.out.println("\nMirrored tree (inorder):");
        inorder(root);
    }
}