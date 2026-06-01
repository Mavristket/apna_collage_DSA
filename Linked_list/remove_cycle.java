public class remove_cycle{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head=null;
    public static Node tail=null;

    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
           tail.next=newNode;
           tail=newNode; 
        }
    }
    void display(){
        if(head==null){
            System.out.println("List is null");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void remove(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    public static void main(String[] args) {
        remove_cycle list=new remove_cycle();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // creating a cycle
        tail.next=head.next;
        list.remove();
        System.out.println("\nAfter removing cycle:");
        list.display();
    }
}