class static_keyword{
    public static void main(String[] args){
        System.out.println("This is a static method");
        Student s1=new Student(1,"Balaji");
        Student s2=new Student(2,"Ganapath");
        System.out.println(s1.rollno+" "+s1.name+" "+s1.college);
        s2.college="XYZ College";
        System.out.println(s2.rollno+" "+s2.name+" "+s2.college);

    }
}
class Student{
    int rollno;
    String name;
    static String college="ABC College";
    Student(int r,String n){
        rollno=r;
        name=n;
    }
}