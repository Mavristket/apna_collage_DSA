import java.util.*;
public class interlive_queue{
    public static void interlive(Queue<Integer> q){
        Queue<Integer> first=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        interlive(q);
        int s=q.size();
        for(int i=0;i<s;i++){
            System.out.println(q.peek());
            q.remove();
        }
    }
}