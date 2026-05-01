class marrge_string_array {

    public static String[] mergesort(String[] arr, int lo, int hi) {
        if (lo == hi) {
            String[] A = { arr[lo] };
            return A;
        }

        int mid = (lo + hi) / 2;

        String[] arr1 = mergesort(arr, lo, mid);
        String[] arr2 = mergesort(arr, mid + 1, hi);

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m + n];

        int i = 0, j = 0, idx = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[j++];
            }
        }

        while (i < m) {
            arr3[idx++] = arr1[i++];
        }

        while (j < n) {
            arr3[idx++] = arr2[j++];
        }

        return arr3;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    public static void main(String[] args) {
        String arr[] = { "banana", "apple", "grape", "orange" };
        int n = arr.length;

        String[] result = mergesort(arr, 0, n - 1);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}