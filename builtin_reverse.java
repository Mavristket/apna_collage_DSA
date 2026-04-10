import java.util.Collections;
import java.util.Arrays;
class builtin_reverse{
    public static void main(String[] args){
        Integer arr[]={9,6,8,7,1,2,4,9,3,4,50};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}