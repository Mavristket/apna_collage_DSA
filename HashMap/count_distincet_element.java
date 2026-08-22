import java.util.*;
public class count_distincet_element{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,1,2,9,8,7};
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            ts.add(arr[i]);
        }
        System.out.print(ts.size());
    }
}