import java.util.*;
public class subarray_sum_equal_to_k{
    public static void main(String[] args){
        int arr[]={20,1,2,4,8,9,7,3,6,7};
        int k=15;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}