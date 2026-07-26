import java.util.*;
public class queue_reverse{
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        int size=q.size();
        for(int i=0;i<size;i++){
            s.add(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args){

        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(6);
        reverse(q);
        int s=q.size();
        for(int i=0;i<s;i++){
            System.out.println(q.peek());
            q.remove();
        }
    }
}