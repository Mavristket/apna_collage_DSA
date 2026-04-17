class checkpoweroftwo{
    public static void main(String[] args){
        int n=15;
        if((n & (n-1))==0){
            System.out.println("power of 2");
        }
        else{
            System.out.println("not a power of 2");
        }
    }
}