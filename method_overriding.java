class method_overriding{
    public static void main(String[] args){
        dog d=new dog();
        d.eat();

    }
}
class animal{
    void eat(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("eating bread");
    }
}