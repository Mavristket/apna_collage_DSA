class tilling_problem{
    public static int tiling(int n){
        if(n==0|| n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tiling(n-1);
        //horizontal choice
        int fnm2=tiling(n-2);
        int totalways=fnm1+fnm2;
        return totalways;   

    }
    public static void main(String[] args){
        int n=4;
        int ans=tiling(n);
        System.out.println(ans);
    }
}