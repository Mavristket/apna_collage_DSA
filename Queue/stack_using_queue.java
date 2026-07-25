import java.util.*;
public class stack_using_queue{
    public static Queue<Integer> q1=new LinkedList<>();
    public static Queue<Integer> q2=new LinkedList<>();

    public static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void add(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }else{
            q2.add(data);
        }
    }
    public static int remove(){
        if(isEmpty()){
            System.out.print("Stack is empty");
            return -1;
        }
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                int top=-1;
                top=q1.remove();
                if(q1.isEmpty()){
                    return top;
                }
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                int top=-1;
                top=q2.remove();
                if(q2.isEmpty()){
                    return top;
                }
                q1.add(top);
            }
        }
        return -1;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.print("Stack is empty");
            return -1;
        }
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                int top=-1;
                top=q1.remove();
                q2.add(top);
                if(q1.isEmpty()){
                    return top;
                }
            }
        }else{
            while(!q2.isEmpty()){
                int top=-1;
                top=q2.remove();
                q1.add(top);
                if(q2.isEmpty()){
                    return top;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        stack_using_queue s=new stack_using_queue();
        s.add(1);
        s.add(2);
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.remove();
        }
    }
}