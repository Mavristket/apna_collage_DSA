import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Original List: " + list);

        // Add element at first
        list.addFirst("C");

        // Add element at last
        list.addLast("JavaScript");

        System.out.println("After Adding: " + list);

        // Remove an element
        list.remove("Python");

        System.out.println("After Removing: " + list);

        // Access element
        System.out.println("First Element: " + list.getFirst());

        // Traverse the list
        System.out.println("Elements:");
        for(String lang : list) {
            System.out.println(lang);
        }
        System.out.println("Complexity of LinkedList operations:");
        System.out.println("Add: O(1) for addFirst and addLast, O(n) for add at index");
        System.out.println("Remove: O(n) for remove by value, O(1) for removeFirst and removeLast");
        System.out.println("Access: O(1) for getFirst and getLast, O(n) for get at index");
    }
}