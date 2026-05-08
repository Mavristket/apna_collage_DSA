import java.util.Arrays;
class builtinsort{
    public static void main(String[] args){
        int arr[]={9,6,1,5,8,7,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Complexity of this algorithm is O(n log n) because it uses a dual-pivot quicksort algorithm which has an average and worst-case time complexity of O(n log n).");   
    }

}