
import java.util.*;

public class best {

    static class Node {
        int vertex;
        int heuristic;

        Node(int vertex, int heuristic) {
            this.vertex = vertex;
            this.heuristic = heuristic;
        }
    }

    public static void bestFirstSearch(
            ArrayList<ArrayList<Integer>> graph,
            int[] heuristic,
            int start,
            int goal) {

        boolean[] visited = new boolean[graph.size()];

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> a.heuristic - b.heuristic
        );

        pq.add(new Node(start, heuristic[start]));

        System.out.println("Best First Search Traversal:");

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            int vertex = current.vertex;

            if (visited[vertex])
                continue;

            visited[vertex] = true;

            System.out.print(vertex + " ");

            if (vertex == goal) {
                System.out.println("\nGoal Found!");
                return;
            }

            for (int neighbour : graph.get(vertex)) {

                if (!visited[neighbour]) {
                    pq.add(new Node(
                        neighbour, heuristic[neighbour]
                    ));
                }
            }
        }

        System.out.println("\nGoal Not Found!");
    }

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph =
            new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);

        // Heuristic values
        int[] heuristic = {10, 8, 5, 7, 3, 0};

        int start = 0;
        int goal = 5;

        bestFirstSearch(graph, heuristic, start, goal);
    }
}
