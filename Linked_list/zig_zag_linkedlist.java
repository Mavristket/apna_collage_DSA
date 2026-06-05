public class zig_zag_linkedlist{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void zigzag(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;


        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node leftl,rightl;
        while(left!=null && right!=null){
            leftl=left.next;
            rightl=right.next;
            left.next=right;
            right.next=leftl;
            left=leftl;
            right=rightl;
        }



    }
    public static void main(String[] args){
    zig_zag_linkedlist list = new zig_zag_linkedlist();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);

    System.out.println("Original list:");

    zig_zag_linkedlist.Node temp = list.head;

    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    System.out.println();

    list.zigzag();

    System.out.println("Zig-zag list:");

    temp = list.head;

    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println("Complexity of this code is O(n) and space complexity is O(1)");
}
}