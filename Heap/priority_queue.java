import java.util.*;
public class priority_queue{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        System.out.println(pq.peek()); // Prints the smallest element
        System.out.println(pq.poll()); // Removes and prints the smallest element
        System.out.println(pq.peek()); // Prints the next smallest element




        
    }

}