class binaryseach{
    public static int search(int nums[],int item){
        int beg=0,end=nums.length-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(nums[mid]==item){
                return mid;
            }
            else if(nums[mid]<item){
                beg=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int item=5;
        int result=search(nums,item);
        if(result==-1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at index: " + result);
        }
        System.out.print("Exit");
    }
}