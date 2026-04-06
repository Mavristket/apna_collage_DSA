class rainwatertrapping {

    public static int trap(int height[]) {
        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        // left max array
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];

        // right max array
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedwater = 0;

        // calculate water
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i]; // FIXED
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = {4, 3, 5, 1, 6, 8};
        int result = trap(height);
        System.out.println("Trapped Water = " + result);
    }
}