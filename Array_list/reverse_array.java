import java.util.*;
class reverse_array{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
    }
}