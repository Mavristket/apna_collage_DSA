
import java.util.*;

public class search {

    int vertices;
    ArrayList<ArrayList<Integer>> adj;

    // Constructor
    searh(int v) {
        vertices = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge
    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // BFS Traversal
    void BFS(int start) {
        boolean visited[] = new boolean[vertices];

        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS: ");

        while (!q.isEmpty()) {
            int node = q.poll();

            System.out.print(node + " ");

            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        System.out.println();
    }

    // DFS Traversal
    void DFS(int node, boolean visited[]) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                DFS(neighbour, visited);
            }
        }
    }

    public static void main(String args[]) {

        search g = new search(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.BFS(0);

        boolean visited[] = new boolean[5];

        System.out.print("DFS: ");
        g.DFS(0, visited);
    }
}
