class bintodec{
    public static void calculate(int number){
        int decnum=0;
        int pow=0;

        while(number>0){
            int rem=number%10;
            decnum=decnum+rem*(int)Math.pow(2,pow);
            pow++;

            number=number/10;

        }
        System.out.println(decnum);
    }
    public static void main(String[] args){
        calculate(1010); // Example binary number   
    }
}