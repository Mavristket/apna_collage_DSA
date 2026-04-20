class super_keyword{
    public static void main(String[] args){
        Child c=new Child();
        c.show();

    }
}
class Parent{
    void display(){
        System.out.println("This is the parent class");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("This is the child class");
    }
    void show(){
        super.display();
        display();
    }
}