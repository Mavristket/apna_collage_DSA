import java.util.*;
public class kth_ancenster{
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
    public static int kth(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftk=kth(root.left,n,k);
        int rightk=kth(root.right,n,k);
        if(leftk==-1 && rightk==-1){
            return -1;
        }
        int max=Math.max(leftk,rightk);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        System.out.print(kth(root,2,1));
    }
}