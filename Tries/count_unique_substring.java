import java.util.*;
public class count_unique_substring{
    public static class Node{
        Node childeren[]=new Node[26];
        boolean eow;
        public Node(){
            for(int i=0;i<26;i++){
                childeren[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        int level=0;
        int len=word.length();
        int idx=0;

        Node curr = root;
        for(;level<len;level++){
            idx=word.charAt(level)-'a' ;
            if(curr.childeren[idx]==null){
                curr.childeren[idx]=new Node();
            }
            curr=curr.childeren[idx];
        }
        curr.eow=true;
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.childeren[i]!=null){
                count+=countNodes(root.childeren[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args){
        String str="abab";
        for(int i=0;i<str.length();i++){
            insert(str.substring(i));
        }
        System.out.print(countNodes(root));
    }

}