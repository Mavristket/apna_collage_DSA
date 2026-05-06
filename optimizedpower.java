class optimizedpower {
    public static int check(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfpow = check(x, n / 2);
        int halfpowsq = halfpow * halfpow;

        // Correct condition
        if (n % 2 != 0) {   // if n is odd
            halfpowsq = x * halfpowsq;
        }

        return halfpowsq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = check(x, n);
        System.out.print(result);
    }
}