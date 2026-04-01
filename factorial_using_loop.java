import java.util.Scanner;
class apna{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.print("factorail"+fact);
        System.out.print("Exit");
}
}