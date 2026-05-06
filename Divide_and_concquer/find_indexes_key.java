class find_indexes_key{
    public static void check(int arr[],int key,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        check(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int key=5;
        System.out.println("Indexes of key "+key+" are:");
        check(arr,key,0);
    }
}