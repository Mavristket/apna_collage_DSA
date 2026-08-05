import java.util.*;
public class transform_sum_of_tree{
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
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=transform(root.left);
        int rightsum=transform(root.right);

        int temp=root.data;
        root.data=leftsum+rightsum;
        return temp+root.data;
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
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        transform(root);
        inorder(root);
    }
}