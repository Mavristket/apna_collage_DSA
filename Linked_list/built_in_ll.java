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

    }
}