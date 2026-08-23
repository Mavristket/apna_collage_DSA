import java.util.*;
public class union_and_intersection{
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        int arr1[]={1,2,3,4,5,6,9,7,8,9};

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        System.out.println("Union="+hs.size());

        hs.clear();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(hs.contains(arr1[i])){
                count++;
                hs.remove(arr1[i]);
            }
        }
        System.out.print("Intersection"+count);
    }
}