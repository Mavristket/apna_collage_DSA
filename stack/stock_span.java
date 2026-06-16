import java.util.*;
public class stock_span{
    public static void stockspan(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=0;i<stock.length;i++){
            int currprice=stock[i];
            while(!s.isEmpty() && currprice>=stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevhigh=s.peek();
                span[i]=i-prevhigh;
            }
        }

    }
    public static void main(String[] args){
        int stock[]={100,80,60,70,60,75,85};
        int span[]=new int[stock.length];
        stockspan(stock,span);
        System.out.println("Stock prices: "+Arrays.toString(stock));
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
        System.out.println("Complexity is O(n) because we are using stack and each element is pushed and popped at most once");
    }
}