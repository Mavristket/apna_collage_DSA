class quick_sort{
    public static int partation(int arr[],int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;

    }
    public static void quick_sort(int arr[],int start,int end){
        if(start<end){
            int pivot=partation(arr,start,end);
            quick_sort(arr,start,pivot-1);
            quick_sort(arr,pivot+1,end);


        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        quick_sort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Complexity of this algorithm is O(n log n) on average and O(n^2) in the worst case when the pivot selection is poor (e.g., when the input array is already sorted or reverse sorted). However, with good pivot selection strategies (e.g., using the median or random pivot), the worst-case time complexity can be improved to O(n log n).");
    }
}