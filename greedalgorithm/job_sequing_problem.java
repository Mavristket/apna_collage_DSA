import java.util.*;
public class job_sequing_problem{
    static class job{
        int id;
        int dead;
        int profit;
        job(int id,int dead,int profit){
            this.id=id;
            this.dead=dead;
            this.profit=profit;
        }   
    }
    public static void main(String[] args){
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new job(i+1,jobInfo[i][0],jobInfo[i][1]));
        }
        Collections.sort(jobs,(a,b)->(b.profit-a.profit));
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){{
            job currjob=jobs.get(i);
            if(currjob.dead>time){
                seq.add(currjob.id);
                time++;
            }
        }
        System.out.println("Job sequence: " + seq);
        for(int j=0;j<seq.size();j++){
            System.out.print(seq.get(j)+" ");
        }
    }

}
}