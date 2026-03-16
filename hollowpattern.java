class hollowpattern{
    public static void pattern(int rows,int column){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || i==rows || j==1 || j==column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");;

                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(5,5); // Example for 5 rows and 5 columns
    }
}