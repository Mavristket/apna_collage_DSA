import java.util.*;
public class dimater_tree{
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int dimeter(Node root){
        if(root==null){
            return 0;
        }
        int ld=dimeter(root.left);
        int lh=height(root.left);
        int rd=dimeter(root.right);
        int rh=height(root.right);

        int selfdim=lh+rh+1;
        return Math.max(selfdim,Math.max(ld,rd));
    }
    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info dimater2(Node root){
        if(root==null){
            return new Info(0,0);

        }
        Info leftInfo=dimater2(root.left);
        Info rightInfo=dimater2(root.right);

        int selfDiam=leftInfo.ht+rightInfo.ht+1;
        int diam=Math.max(selfDiam,Math.max(leftInfo.diam,rightInfo.diam));
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,ht);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("Dimater of the binary tree: " + dimater2(root).diam);
    }
}