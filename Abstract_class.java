class Abstract_class{
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.sound();

        Cat cat=new Cat();
        cat.sound();

    }
}
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}