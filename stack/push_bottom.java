import java.util.*;
public class push_bottom{
    public static void push_bo(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        push_bo(s,data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        push_bo(s,40);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}