class clearithbit {
    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        System.out.println(clear(n, i));
    }
}