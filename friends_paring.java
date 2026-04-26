class friends_pairing {
    public static int check(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // single
        int fnm1 = check(n - 1);

        // pair
        int fnm2 = check(n - 2);
        int ways = (n - 1) * fnm2;

        // total ways
        return fnm1 + ways;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(check(n));
    }
}