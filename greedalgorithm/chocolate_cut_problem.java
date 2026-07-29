import java.util.*;
public class chocolate_cut_problem{
    public static void main(String[] args){
        int n=4;
        int m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0;
        int v=0;
        int hp=1;
        int vp=1;
        int cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costHor[h]>=costVer[v]){
                System.out.println("Cutting horizontal with cost: " + costHor[h]);
                cost += costHor[h] * vp;
                h++;
                hp++;
            } else {
                System.out.println("Cutting vertical with cost: " + costVer[v]);
                cost += costVer[v] * hp;
                v++;
                vp++;
            }
            while(h<costHor.length){
                System.out.println("Cutting horizontal with cost: " + costHor[h]);
                cost += costHor[h] * vp;
                h++;
                hp++;
            }
            while(v<costVer.length){
                System.out.println("Cutting vertical with cost: " + costVer[v]);
                cost += costVer[v] * hp;
                v++;
                vp++;
            }   
        }
        System.out.println("Total cost: " + cost);
    }
}