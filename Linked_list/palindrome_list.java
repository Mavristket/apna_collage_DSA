public class palindrome_list { 
    public static class Node { 
        int data; 
        Node next; 
        public Node(int data) { 
            this.data = data; 
            this.next = null; 
        } 
    } 

    public Node head = null; 
    public Node tail = null; 
    public static int size = 0; 

    void add(int value) { 
        Node newNode = new Node(value); 
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

    public Node findmiddle(Node head) { 
        Node slow = head; 
        Node fast = head; 
        // Fixed condition to accurately grab the split point
        while (fast != null && fast.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 
    } 

    public boolean ispalindrome() { 
        if (head == null || head.next == null) { 
            return true; 
        } 
        
        Node middle = findmiddle(head); 
        Node prev = null; 
        Node curr = middle; 
        Node next = null; 

        // Reversing the second half of the list
        while (curr != null) { 
            next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next; // Fixed loop progression bug
        } 

        Node left = head; 
        Node right = prev; 

        // Comparing values from both halves
        while (right != null) { // Fixed termination check
            if (left.data != right.data) { 
                return false; 
            } 
            left = left.next; 
            right = right.next; 
        } 
        return true; 
    } 

    public static void main(String[] args) { 
        palindrome_list p = new palindrome_list(); 
        p.add(1); 
        p.add(2); 
        p.add(1); 
        p.display(); 
        System.out.println(); 
        System.out.println(p.ispalindrome()); 
        System.out.println(p.size);
        System.out.println("Complexity: O(n)");
    } 
}
