import java.util.*;
public class deque{
    public static void main(String[] args){
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addFirst(40);
        dq.addFirst(50);
        dq.addFirst(60);
        int size=dq.size();
        for(int i=0;i<size;i++){
            System.out.println(dq.peek());
            dq.remove();
        }
    }
}