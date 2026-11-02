import java.util.*;

public class traverser {

    static void BFS(ArrayList<ArrayList<Integer>> graph, int V, int start) {

        boolean visited[] = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS: ");

        while (!q.isEmpty()) {

            int curr = q.remove();
            System.out.print(curr + " ");

            for (int neighbor : graph.get(curr)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    public static void main(String args[]) {

        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        BFS(graph, V, 0);
    }
}