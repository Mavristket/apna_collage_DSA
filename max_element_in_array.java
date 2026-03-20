public class MinMaxFunction {

    // function to find minimum
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;   // +infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // function to find maximum
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;   // -infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 3, 25};

        int minValue = findMin(arr);
        int maxValue = findMax(arr);

        System.out.println("Smallest value: " + minValue);
        System.out.println("Largest value: " + maxValue);
    }
}