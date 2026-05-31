public class cycle_check{
    Node head; 
    Node tail; 
    int size; 

    class Node { 
        int data; 
        Node next; 

        public Node(int data) { 
            this.data = data; 
            this.next = null; 
        } 
    } 

    void add(int data) { 
        Node newNode = new Node(data);
        if (head == null) { 
            head = newNode; 
            tail = newNode; 
        } else { 
            tail.next = newNode; 
            tail = newNode; 
        } 
        size++; 
    }
    public static void display(Node head) { 
        if (head == null) { 
            System.out.println("The linked list is empty."); 
            return; 
        } 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
    }
    public static boolean hascycle(Node head){
        if(head==null){
            return false;

        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        cycle_check list = new cycle_check();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Creating a cycle for testing
        list.tail.next = list.head; // Comment this line to test without a cycle

        System.out.println("Does the linked list have a cycle? " + hascycle(list.head));
    }
} 