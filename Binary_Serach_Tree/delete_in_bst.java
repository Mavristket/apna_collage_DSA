import java.util.*;
public class delete_in_bst{
    public static class Node{
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
        if(val<root.data){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static Node find(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            Node IS=find(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static void root_to_leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            System.out.println(path);
        }
        root_to_leaf(root.left,path);
        root_to_leaf(root.right,path);
        path.remove(path.size()-1);

    }
    public static void printinrange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printinrange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printinrange(root.right,k1,k2);
        }else if(root.data>k2){
            printinrange(root.left,k1,k2);
        }else{
            printinrange(root.right,k1,k2);
        }
    }
    public static void main(String[] args){
        int arr[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        root=delete(root,7);
        printinrange(root,1,5);
        ArrayList<Integer> path=new ArrayList<>();
        root_to_leaf(root,path);
    }
}