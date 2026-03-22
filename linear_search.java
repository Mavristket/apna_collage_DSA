class linear_search{
    public static int search(int nums[],int item){
        for(int i=1;i<nums.length;i++){
            if(nums[i]==item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int item=5;
        int index=search(nums,item);
        if(index==-1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at index: " + index);
        }

    }
}