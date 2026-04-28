class marge_sort{
    public static void marge_s(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        marge_s(arr, start, mid);
        marge_s(arr,mid+1,end);

        marge(arr,start,mid,end);
    }
    public static void marge(int arr[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
               temp[k++]=arr[j++] ;
            }
            }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        marge_s(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}