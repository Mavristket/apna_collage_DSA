
import java.util.*;

public class krushkal {

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

    static void createGraph(ArrayList<Edge> edges) {

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    // Initialize parent array
    static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    // Find operation
    static int find(int x) {
        if (par[x] == x) {
            return x;
        }

        return par[x] = find(par[x]);
    }

    // Union operation
    static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (parA == parB) {
            return;
        }

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        }
        else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        }
        else {
            par[parB] = parA;
        }
    }

    // Kruskal's Algorithm
    static void kruskalMST(ArrayList<Edge> edges) {

        init();

        // Sort edges according to weight
        Collections.sort(edges, (a, b) -> a.wt - b.wt);

        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < n - 1 && i < edges.size(); i++) {

            Edge e = edges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);

            // Check cycle
            if (parA != parB) {

                union(e.src, e.dest);

                mstCost += e.wt;
                count++;

                System.out.println(
                    e.src + " - " + e.dest + " : " + e.wt
                );
            }
        }

        if (count != n - 1) {
            System.out.println("MST does not exist");
        } else {
            System.out.println("Minimum Cost of MST = " + mstCost);
        }
    }

    public static void main(String args[]) {

        ArrayList<Edge> edges = new ArrayList<>();

        createGraph(edges);

        kruskalMST(edges);
    }
}
