class backtracking_array {

    public static void backtracking(int arr[], int i, int n) {

        if(i == arr.length) {
            printa(arr);
            return;
        }

        arr[i] = n;

        backtracking(arr, i+1, n+1);

        arr[i] = arr[i] - 2;
    }

    public static void printa(int arr[]) {

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = new int[10];

        backtracking(arr,0,1);

        printa(arr);   // IMPORTANT
    }
}