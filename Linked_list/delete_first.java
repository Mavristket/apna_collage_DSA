public class delete_first{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    void deleteFirst(){
        if(head==null){
            System.out.print("The ll is empty");
            return;
        }
        head=head.next;
        
    }
    public static void main(String[] args){
        delete_first s=new delete_first();
        s.add(10);
        s.add(20);
        s.add(30);
        s.display();
        System.out.println("\nAfter deleting the first node:");
        s.deleteFirst();
        s.display();
    }
}