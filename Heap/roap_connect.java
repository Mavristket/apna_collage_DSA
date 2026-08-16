import java.util.*;
public class roap_connect{
    public static void main(String[] args){
        int roap[]={1,2,3,4,5};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<roap.length;i++){
            pq.add(roap[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            cost+=min+min2;
            pq.add(min+min2);
            
        }
        System.out.println("Total cost: " + cost);
    }
}