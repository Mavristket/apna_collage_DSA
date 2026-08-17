import java.util.*;
public class week_soljer{
    static class Row implements Comparable<Row>{
        int soljer;
        int idx;
        Row(int soljer,int idx){
            this.soljer=soljer;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r){
            if(this.soljer==r.soljer){
                return this.idx-r.idx;
            }else{
                return this.soljer-r.soljer;
            }
        }
    }
    public static void main(String[] args){
        int soljer[][]={{1,0,0},{1,0,0},{1,0,1}};

        PriorityQueue<Row> pq=new PriorityQueue<>();
        for(int i=0;i<soljer.length;i++){
            int count=0;
            for(int j=0;j<soljer[i].length;j++){
                if(soljer[i][j]==1){
                    count++;
                }
            }
            Row r=new Row(count,i);
            pq.add(r);
        }
        int k=2;
        for(int i=0;i<k;i++){
            Row r=pq.poll();
            System.out.println(r.idx);
        }
    }
}