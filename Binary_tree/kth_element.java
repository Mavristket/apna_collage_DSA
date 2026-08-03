public class kth_element{
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
    public static void level(Node root,int level,int k){
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        level(root.left,level+1,k);
        level(root.right,level+1,k);

    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        int k=2;
        level(root,0,k);
    }
}