public class doublyLL{
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public int size=0;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            size++;
        }
    }
    public void remove(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
        
    }
    public static void main(String[] args){
        doublyLL list=new doublyLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List after adding elements:");
        list.print();
        list.remove();
        System.out.println("List after removing last element:");
        list.print();
        System.out.println("Size of the list: "+list.size);
        System.out.println("Complexity of add and remove operations: O(1)");
        list.reverse();
        list.print();
        System.out.println("Complexity of the reverse is the O(1)");
        
    }
}