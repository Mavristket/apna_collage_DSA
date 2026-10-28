
import java.util.*;

public class bellamanford {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }

    static void bellmanFord(ArrayList<Edge> graph[], int src) {
        int V = graph.length;
        int dist[] = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Relax all edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < V; j++) {
                for (Edge e : graph[j]) {
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[u] != Integer.MAX_VALUE
                            && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        // Check for negative weight cycle
        for (int j = 0; j < V; j++) {
            for (Edge e : graph[j]) {
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dist[u] != Integer.MAX_VALUE
                        && dist[u] + wt < dist[v]) {
                    System.out.println("Negative weight cycle detected");
                    return;
                }
            }
        }

        // Print shortest distances
        for (int i = 0; i < V; i++) {
            System.out.println("Distance from source to vertex "
                    + i + " = " + dist[i]);
        }
    }

    public static void main(String args[]) {
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        bellmanFord(graph, 0);
    }
}
