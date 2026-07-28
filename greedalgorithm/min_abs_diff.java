import java.util.*;
public class min_abs_diff{
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int b[]={5,4,3,2,1};
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            mindiff=Math.min(mindiff,Math.abs(a[i]-b[i]));
        }
        System.out.print(mindiff);
    }
}