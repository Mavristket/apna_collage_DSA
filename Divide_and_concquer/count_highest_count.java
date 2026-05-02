class count_highest_count{
    public static int majorityElement(int[] nums){
        int majorityCount=nums.length/2;

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>majorityCount){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[]={2,2,2,1,1,2,1,2};
        System.out.println(majorityElement(nums));
        System.out.println("complexity is O(n^2)");
    }
    
}