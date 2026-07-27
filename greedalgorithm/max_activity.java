import java.util.*;
public class max_activity{
    public static void main(String[] args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        maxAct=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=0;i<end.length;i++){
            if(start[i]>=lastend){
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Maximum activities: " + maxAct);
        System.out.println("Selected activities: " + ans);
    }
}