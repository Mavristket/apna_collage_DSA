import java.util.*;
public class subtree{
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
    public static boolean issubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(issametree(root,subroot)){
                return true;
            }
        }
        return issubtree(root.left,subroot) || issubtree(root.right,subroot);
    }
    public static boolean issametree(Node root,Node subroot){
        if(root==null && subroot==null){
            return true;
        }
        if(root==null || subroot==null || root.data!=subroot.data){
            return false;
        }
        return issametree(root.left,subroot.left) && issametree(root.right,subroot.right);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);

        System.out.println("Is subtree: " + issubtree(root,subroot));
    }
}