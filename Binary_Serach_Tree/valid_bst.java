import java.util.*;
public class valid_bst{
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
    public static boolean isvalid(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }
        return isvalid(root.left,min,root) && isvalid(root.right,root,max);
    }
    public static void main(String[] args){
        int arr[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        if(isvalid(root,null,null)){
            System.out.println("valid bst");
        }
    }
}
