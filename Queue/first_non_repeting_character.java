import java.util.*;
public class first_non_repeting_character{
    public static void printNonRepeating(String str){
        int arr[]=new int[20];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            arr[ch-'a']++;
            while(!q.isEmpty()&& arr[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1);
            }else{
                System.out.print(q.peek());
            }
        }
    }
    public static void main(String[] args){
        String str="aabccdbeff";
        printNonRepeating(str);
    }
}