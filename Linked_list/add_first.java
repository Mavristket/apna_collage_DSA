public class add_first {

    // Node class
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

    // Add at first
    void add(int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Add at first
        newNode.next = head;
        head = newNode;
    }

    // Display
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {

        add_first a = new add_first();

        a.add(10);
        a.add(20);
        a.add(30);

        a.display();
    }
}