class sumofnum{
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int snm1=sum(n-1);
        int sn= n + snm1;
        return sn;
    }
    public static void main(String[] arfs){
        int n=5;
        int sn=sum(n);
        System.out.println(sn);     
    }
}