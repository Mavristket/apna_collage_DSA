import java.util.*;
public class reverse_stack{
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        insertAtBottom(s,top);
    }
    public static void insertAtBottom(Stack<Integer> s,int top){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int curr=s.pop();
        insertAtBottom(s,top);
        s.push(curr);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        System.out.println("Original Stack: " + s);
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println("Complexity is O(n^2) because we are using two recursive calls and each call is O(n) in worst case");
    }
}