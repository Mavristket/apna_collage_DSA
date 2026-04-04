class prefixSum {
    public static void sum(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        // Step 1: Create prefix array
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Step 2: Find max subarray sum
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                if (start == 0) {
                    currsum = prefix[end];
                } else {
                    currsum = prefix[end] - prefix[start - 1];
                }

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Max Sum = " + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6};
        sum(numbers);
        System.out.print("Exit");

    }
}