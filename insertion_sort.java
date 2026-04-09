class insertion_sort {
    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            int value = arr[curr];   // ✅ store original value
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > value) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = value;   // ✅ use stored value
        }
    }

    public static void p(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 1, 7, 3, 4};
        sort(arr);
        p(arr);
    }
}