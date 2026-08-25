import java.util.*;
public class creating_tries{
    static class Node{
        Node childeren[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<26;i++){
                childeren[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level < word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.childeren[idx]==null){
                curr.childeren[idx]=new Node();
            }
            curr=curr.childeren[idx];
        }
          curr.eow = true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level < key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.childeren[idx]==null){
                return false;
            }
            curr=curr.childeren[idx];
        }
        return curr.eow==true;
    }
    public static void main(String[] args){
        String words[]={ "the","therir","theree"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("the"));
    }
}