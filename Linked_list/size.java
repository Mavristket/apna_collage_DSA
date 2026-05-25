public class size {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;

        size++;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        size s = new size();

        s.add(10);
        s.add(20);
        s.add(30);

        s.display();

        System.out.println("\nSize of the linked list: " + s.size);
    }
}