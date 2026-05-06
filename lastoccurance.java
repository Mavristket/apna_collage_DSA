class lastoccurance {
    public static int check(int arr[], int key, int i) {
        // Base case
        if (i == arr.length) {
            return -1;
        }

        // Recursive call
        int isfound = check(arr, key, i + 1);

        // Check current index AFTER recursion
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3};
        int key = 3;

        int ans = check(arr, key, 0);
        System.out.println(ans);
    }
} 