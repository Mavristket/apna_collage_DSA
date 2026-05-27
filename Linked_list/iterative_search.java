class iterative_search{
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
    public void add(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(){
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
    public int itesearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args){
        iterative_search i=new iterative_search();
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(40);
        i.add(50);
        i.display();
        System.out.print(i.itesearch(30));
    }
}