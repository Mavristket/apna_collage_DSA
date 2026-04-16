class ithbit{
    public static void test(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    public static void main(String[] args){
        int n=5;
        int i=2;
        test(n,i);
    }
}