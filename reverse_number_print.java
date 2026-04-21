class reverse{
    public int p(int n){
        if(n>0){
            System.out.print(n);
            return p(n-1);
        }
        return 0;
    }
    public static void main(String[] args){
        reverse r=new reverse();
        r.p(5);
    }
}