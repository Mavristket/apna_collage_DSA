import java.util.*;
public class stack_using_deque{
    static class stack{
        Deque<Integer> d=new LinkedList<>();
        public void push(int data){
            d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.peekLast();
        }
    }
    public static void main(String[] args){
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}