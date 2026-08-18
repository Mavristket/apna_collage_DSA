import java.util.*;

public class Hashmap {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Total number of nodes (size)
        private int N; // Total number of buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0;
            this.N = 4; // Crucial fix: Initialize total capacity to 4, not 0
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // Fixed "bucket" to "buckets"
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N; // Safeguarded from / by zero
        }

        public void put(K key, V value) { // Made public so main method can access it
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // Passed missing 'bi' parameter

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value; // Fixed Node.value to node.value
            } else {
                buckets[bi].add(new Node(key, value)); // Fixed "bucket" to "buckets"
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets; // Corrected array type from ArrayList[]
            int oldN = N;
            
            this.N = oldN * 2;
            this.n = 0; // Reset element count since put() will recalculate it
            this.buckets = new LinkedList[N];
            
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                while (!ll.isEmpty()) { // Safely process and empty the old lists
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public boolean containsKey(K key) { // Made public for external checks
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        private int searchInLL(K key, int bi) { // Fixed data type 'k' to generic 'K'
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (Objects.equals(node.key, key)) { // Replaced '==' with .equals() for object safety
                    return di;
                }
                di++;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 110);
        hm.put("pakistan", 200);
        hm.put("us", 250);
        
        System.out.println("Contains India? " + hm.containsKey("India"));
    }
}
