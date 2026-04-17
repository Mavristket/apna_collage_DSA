class updateithbit {
    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static int set(int n,int i,int newbit){
        n=clear(n,i);
        int bitmask=newbit<<i;
        n=n|bitmask;
        return n;
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        System.out.println(set(n, i, 1));
    }
}