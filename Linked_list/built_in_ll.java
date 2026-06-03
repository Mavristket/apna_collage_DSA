import java.util.*;
public class built_in_ll{
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("Original list:"+list);
        list.removeLast();
        list.removeFirst();
        System.out.println("After removing first and last:"+list);
        System.out.println("Complexity of LinkedList operations:");
        System.out.println("Add: O(1) for addFirst and addLast, O(n) for add at index");
        System.out.println("Remove: O(n) for remove by value, O(1) for removeFirst and removeLast");
        System.out.println("Access: O(1) for getFirst and getLast, O(n) for get at index");

    }
}