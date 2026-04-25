public class xtothepowern{
    public static int check(int x,int n){
        if(n==0){
            return 1;
        }
        return x*check(x,n-1);
    }
    public static void main(String[] args){
        int x=2;
        int n=5;
        int result=check(x,n);
        System.out.println(result);
    }
}