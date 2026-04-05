class kadanssumneg {
    public static int sum(int numbers[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int negmin = Integer.MIN_VALUE;

        // Check if all elements are negative
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negmin = Math.max(negmin, numbers[i]);
            } else {
                break;
            }

            // If reached end → all are negative
            if (i == numbers.length - 1) {
                return negmin;
            }
        }

        // Kadane's Algorithm
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }

        return ms;
    }

    public static void main(String[] args) {
        int numbers[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum sum: " + sum(numbers));
    }
}