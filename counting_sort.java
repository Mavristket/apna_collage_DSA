class counting_sort{
    public static void sort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;

            }
        }
    }
    public static void main(String[] args){
        int arr[]={9,6,1,5,8,7,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}