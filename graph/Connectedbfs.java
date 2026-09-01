import java.util.*;

public class Connectedbfs {

    public static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    // BFS for disconnected graph
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                utilbfs(graph, vis, i);
            }
        }
    }

    // BFS for one component
    public static void utilbfs(ArrayList<Edge>[] graph, boolean[] vis, int start) {

        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {

            int curr = q.remove();

            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {

                Edge e = graph[curr].get(i);

                if (!vis[e.des]) {
                    q.add(e.des);
                    vis[e.des] = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -> 1
        graph[0].add(new Edge(0, 1, 5));

        // 1 -> 0, 2, 3
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -> 1, 3, 4
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3 -> 2
        graph[3].add(new Edge(3, 2, 1));

        // 4 -> 2
        graph[4].add(new Edge(4, 2, 1));

        bfs(graph);
    }
}