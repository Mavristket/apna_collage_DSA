class inverted_half_parimed
{
 public static void patern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void main(String[] args){
        patern(5);
    }
 }

