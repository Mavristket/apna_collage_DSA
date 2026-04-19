class inheritance {
    String name;

    void print() {
        System.out.println(name);
    }
}

class son extends inheritance {
    void speak() {
        System.out.println("can speak");
    }

    public static void main(String[] args) {
        son s = new son();
        s.name = "balaji";
        s.print();
        s.speak();
    }
}