class minimized_bubbble_sort{
    public static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        bubble_sort(arr);
        System.out.println("Sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("comlexity of this algorithm is O(n) in best case and O(n^2) in worst case");
    }
}