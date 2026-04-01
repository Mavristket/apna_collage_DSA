class max_element_array {
    public static int findmax(int nums[]) {
        int largest = Integer.MIN_VALUE;  // FIXED

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int maxm = findmax(nums);
        System.out.println("The largest element in the array is: " + maxm);
        System.out.print("Exit");
    }
}