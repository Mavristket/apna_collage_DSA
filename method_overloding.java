class method_overloding{
    public static void main(String[] args){
        calculator c=new calculator();
        System.out.println(c.sum(10,20));
        System.out.println(c.sum(10.5f,20.5f));

    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }
}