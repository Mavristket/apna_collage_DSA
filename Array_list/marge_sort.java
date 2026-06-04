import java.util.*;

public class marge_sort {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node marges(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = mid(head);
        Node rightll = mid.next;
        mid.next = null;
        Node leftll = head;

        leftll = marges(leftll);
        rightll = marges(rightll);

        return marge(leftll, rightll);
    }

    public Node mid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node marge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while (head2 != null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return dummy.next;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        marge_sort ms = new marge_sort();

        Node head = new Node(20);
        head.next = new Node(10);
        head.next.next = new Node(30);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(9);

        System.out.print("Original List: ");
        print(head);

        head = ms.marges(head);

        System.out.print("Sorted List: ");
        print(head);
        System.out.println("O(n log n)");
    }
}