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
}