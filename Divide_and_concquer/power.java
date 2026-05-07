class power{
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }
        int half=power(a,n/2);
        int full=half*half;
        if(n%2!=0){
            full=full*a;
        }   
        return full;
    }
    public static void main(String[] args) {
        int a=2;
        int n=10;
        System.out.println(a+" raised to the power "+n+" is: "+power(a,n));
        System.out.println("Complexity of this algorithm is O(log n) because we are dividing the problem into half at each step.");
    }
}