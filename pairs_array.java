public class pairs_array{
    public static void pair(int numbers[]){
        for(int i=0;i< numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print(numbers[i]);
                System.out.print(numbers[j]);
                

        }
        System.out.println();
    }
    }
    public static void main(String[] args){
        int numbers[]={10,20,30,40,50,6};
        pair(numbers);

    } 
} 