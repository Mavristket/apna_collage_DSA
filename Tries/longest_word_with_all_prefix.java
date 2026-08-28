import java.util.*;
public class longest_word_with_all_prefix{
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
    public static String ans="";
    public static void longestword(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.childeren[i]!=null && root.childeren[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestword(root.childeren[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args){
        String words[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestword(root,new StringBuilder (""));
        System.out.println(ans);

    }
}