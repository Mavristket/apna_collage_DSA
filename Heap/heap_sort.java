import java.util.*;
public class heap_sort{
    public void heapsort(int arr[]){
        int length=arr.length;
        for(int i=length/2-1;i>=0;i--){
            heapify(arr,length,i);
        }
        for(int i=length-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    public void heapify(int arr[],int length,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<length && arr[largest]<arr[left]){
            largest=left;
        }
        if(right<length && arr[largest]<arr[right]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,length,largest);
        }
    }
    public static void main(String[] args){
        int arr[]={1,5,4,3,2};
        heap_sort hs=new heap_sort();
        hs.heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}