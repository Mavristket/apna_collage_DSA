class even_odd_bitwise{
    public static void test(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        int n=5;
        test(n);
    }
}