class print_first_occurance{
    public static int check(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return check(arr, key, i+1);
    }
    public satic void min(String[] args){
        int arr[]={1,2,3,4,5,3};
        int key=3;
        int ans=check(arr, key, 0);
        System.out.println(ans);
    }
}