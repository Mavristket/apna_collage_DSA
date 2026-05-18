import java.util.*;
class sort_list{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(90);
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(20);

        System.out.print(list);
        Collections.sort(list);
        System.out.print(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);
    }
}