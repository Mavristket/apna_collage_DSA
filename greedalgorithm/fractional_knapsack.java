import java.util.*;
public class fractional_knapsack{
    public static void main(String[] args){
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int w=50;
        double ratio[][]=new double[weight.length][2];
        for(int i=0;i<weight.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)value[i]/weight[i];

        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=w;
        double finalvalue=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalvalue+=value[idx];
                capacity-=weight[idx];
            }else{
                finalvalue+=ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }
        System.out.print(finalvalue);
    
}
}