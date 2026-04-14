import java.util.*;
class string_basics{
    public static void main(String[] args){
        String str="balaji";
        String str1=new String("Gaikwad");
        Scanner sc=new Scanner(System.in);
        String str2=sc.nextLine();
        System.out.println(str);
        String fullname=str + str1;
        System.out.println(fullname);
    }
}