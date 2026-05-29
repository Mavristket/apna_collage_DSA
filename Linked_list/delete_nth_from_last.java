public class delete_nth_from_last{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public static int size=0;

    void add(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    void display(){
        if(head==null){
            System.out.println("The linked list is empty.");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void delete(int n){
        if(n>size){
            System.out.println("Invalid input. n is greater than the size of the linked list.");
            return;
        }
        if(n==size){
            head=head.next;
            size--;
            return;
        }
        Node prev=head;
        int i=0;
        int pos=size-n;
        while(i<pos-1){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        size--;

    }
    public static void main(String[] args){
        delete_nth_from_last i=new delete_nth_from_last();
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(40);
        i.add(50);
        i.display();
        System.out.println();
        i.delete(2);
        i.display();
        System.out.println("Complexity of deleting the nth node from the end of a linked list is O(n) where n is the number of nodes in the linked list.");
    }
}