class copy{
    int a;
    copy(){}
    copy(copy obj){
        this.a=obj.a;
    }
    void display(){
        System.out.println(a);
    }
    public static void main(String[] args){
        copy obj=new copy();
        obj.a=10;
        obj.display();

        copy obj1=new copy(obj);
        obj1.display();

    }
}
