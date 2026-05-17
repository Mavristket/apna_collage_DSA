import java.util.*;
class swap_array{
    public static void swap(ArrayList<Integer> list,int index1,int index2){
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.print(list);
        swap(list,1,3);
        System.out.print(list);
    }
}