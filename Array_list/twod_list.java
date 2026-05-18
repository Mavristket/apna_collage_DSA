import java.util.*;
class twod_list{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> main=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        for(int i=0;i<5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        main.add(list1);
        main.add(list2);
        main.add(list3);
        for(int i=0;i<main.size();i++){
            ArrayList<Integer> curr=main.get(i);
            for(int j=1;j<curr.size();j++){
                System.out.print(curr.get(j));
            }
            System.out.println();
        }
    }

}