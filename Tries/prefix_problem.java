import java.util.*; 

public class prefix_problem { 
    public static class Node { 
        Node children[] = new Node[26]; // Fixed typo 'childeren'
        boolean eow = false; 
        int freq; 
        
        public Node() { 
            for (int i = 0; i < children.length; i++) { 
                children[i] = null; // Removed duplicate 'Node' declaration
            } 
            freq = 1; 
        } 
    } 

    public static Node root = new Node(); 

    public static void insert(String word) { 
        Node curr = root; 
        for (int i = 0; i < word.length(); i++) { 
            int idx = word.charAt(i) - 'a'; 
            if (curr.children[idx] == null) { 
                curr.children[idx] = new Node(); 
            } else { 
                curr.children[idx].freq++; 
            } 
            curr = curr.children[idx]; // Added missing traversal step
        } 
        curr.eow = true; 
    } 

    public static void findprefix(Node root, String ans) { 
        if (root == null) { 
            return; 
        } 
        if (root.freq == 1) { // Added missing base case value 1
            System.out.println(ans); // Changed to println for neat output
            return; 
        } 
        for (int i = 0; i < root.children.length; i++) { // Added missing loop initialization 0
            if (root.children[i] != null) { 
                findprefix(root.children[i], ans + (char)(i + 'a')); // Fixed typo 'childern'
            }
        } 
    } 

    public static void main(String[] args) { 
        String arr[] = {"balaji", "baliram", "balbhim", "baloraja", "bala"}; // Fixed type from int[] to String[]
        for (int i = 0; i < arr.length; i++) { // Added missing loop initialization 0
            insert(arr[i]); 
        } 
        root.freq = -1; 
        findprefix(root, ""); 
    } 
}
