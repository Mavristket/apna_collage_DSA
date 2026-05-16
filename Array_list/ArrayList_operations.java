import java.util.*;
class ArrayList_operations{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.add(1,5);
        list.set(2,100);
        list.get(4);
        System.out.print(list);
        list.remove(1);
        System.out.print(list);
    }
}