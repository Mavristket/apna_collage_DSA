public class add_pos {

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

    void add(int value, int pos) {

        Node newNode = new Node(value);

        // Insert at beginning
        if (pos == 1) {
            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = newNode;
            }
        }

        else {

            Node temp = head;

            int i = 1;

            // Move to previous node
            while (i < pos - 1 && temp != null) {
                temp = temp.next;
                i++;
            }

            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            // Update tail
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        add_pos a = new add_pos();

        a.add(10, 1);
        a.add(20, 2);
        a.add(30, 3);

        a.add(15, 2);

        a.display();
    }
}