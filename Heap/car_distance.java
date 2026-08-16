import java.util.*;
public class car_distance{
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        Point(int x,int y,int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
        @Override
        public int compareTo(Point p){
            return this.dist-p.dist;
        }
    }
    public static void main(String[] args){
        int pts[][]={{1,2},{3,4},{1,-1}};
        int k=2;
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int x=pts[i][0];
            int y=pts[i][1];
            int dist=x*x+y*y;
            Point p=new Point(x,y,dist);
            pq.add(p);
        }
        for(int i=0;i<k;i++){
            Point p=pq.poll();
            System.out.println("("+p.x+","+p.y+")");
        }
    }

}