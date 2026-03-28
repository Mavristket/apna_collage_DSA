class sumsubarray{
    public static void sub(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                System.out.println("Sum: "+sum);
            }
            System.out.println();

        }


    }
    public static void main(String[] args){
        int numbers[]={2,4,6};
        sub(numbers);

    }
}