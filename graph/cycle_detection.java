import java.util.*;
public class cycle_detection{
    static class Edge{
        int src;
        int des;
       
        public Edge(int s,int d,int w){
            this.src=s;
            this.des=d;
        }


    }
    public static boolean detectCycle(ArrayList<Edge>[] grapg){
        boolean vis[]=new boolean[grapg.length];
        for(int i=0;i<grapg.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(grapg,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.des]){
                if(detectCycleUtil(graph, vis, e.des, curr)){
                    return true;
                }
            } else if(e.des != parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,1));

        System.out.println(detectCycle(graph));
    }
}
