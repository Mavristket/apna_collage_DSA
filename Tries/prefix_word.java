import java.util.*;
public class prefix_word{
    public static class Node{
        Node childeren[]=new Node[26];
        boolean eow;
        public Node(){
        for(int i=0;i<childeren.length;i++){
            childeren[i]=null;
        }
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        int level=0;
        int len=word.length();
        int idx=0;

        Node curr=root;
        for(;level<len;level++){
            idx=word.charAt(level)-'a' ;
            if(curr.childeren[idx]==null){
                curr.childeren[idx]=new Node();
            }
            curr=curr.childeren[idx];
        }
        curr.eow=true;
    }
    public static boolean startwith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.childeren[idx]==null){
                return false;
            }
            curr=curr.childeren[idx];
        }
        return true;
    }
    public static void main(String[] args){
        String words[]={"apple","app","mango","banana","man","woman"};
        String prefix="app";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.print(startwith(prefix));
    }
}