class print_ascending_order{
    public static void main(String[] args){
        print(5);
    }
}
void print(int n){
        if(n>0){
            print(n-1);
            System.out.print(n + " ");
        }
    }