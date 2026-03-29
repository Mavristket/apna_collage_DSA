class maxsumarray{
    public static void sub(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum=currentsum+numbers[k];
                }
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
                
            }

        }
         System.out.println("Maximum sum: "+maxsum);


    }
    public static void main(String[] args){
        int numbers[]={2,4,6};
        sub(numbers);

    }
}