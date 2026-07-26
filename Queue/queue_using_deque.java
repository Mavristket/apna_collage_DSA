import java.util.*;
public class queue_using_deque{
    static class queue{
        Deque<Integer> d=new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.peekFirst();
        }
    }
    public static void main(String[] args){
        queue q=new queue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}