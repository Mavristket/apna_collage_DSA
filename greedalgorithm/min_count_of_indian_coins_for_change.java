import java.util.*;
public class min_count_of_indian_coins_for_change{
    public static void main(String[] args){
        Integer coins[]={1,2,5,10,50,100,500,2000};
        int amount=590;
        int count=0;
        Arrays.sort(coins,Collections.reverseOrder());
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(amount>=coins[i]){
                    amount-=coins[i];
                    count++;
                }
            }
        }
        System.out.println("Minimum number of coins required: " + count);
    }
}