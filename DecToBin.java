class DecToBin {

    public static int calculate(int number) {

        int pow = 0;
        int binnum = 0;

        while (number > 0) {
            int rem = number % 2;

            binnum = binnum + rem * (int) Math.pow(10, pow);

            pow++;

            number = number / 2;
        }

        return binnum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(10));
    }
}