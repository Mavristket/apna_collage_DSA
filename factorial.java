class factorial{
    public static void main(String[] args){
        int result=fact(5);
        System.out.println(result);

    }

static int fact(int n){
    if(n>0){
        return n*fact(n-1);
    }else{
        return 1;
    }
}
}