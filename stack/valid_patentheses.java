import java.util.*;
public class valid_patentheses{
    public static boolean isvalid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(!s.isEmpty() && s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return false;
                }else{
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args){
        String str="((a+b)+(c+d))";
        System.out.println(isvalid(str));
    }
}