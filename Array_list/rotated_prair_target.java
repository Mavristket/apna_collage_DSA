import java.util.*;
class rotated_prair_target{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int lp=0;;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                lp=i;
                break;
            }
        }

        int lpp=lp+1;
        int rpp=lp;
        int target=12;
        System.out.print(search(list,lpp,rpp,target));
        System.out.println("O(n)");
}
public static boolean search(ArrayList<Integer> list,int lpp,int rpp,int target){
    while(lpp!=rpp){
            if(list.get(lpp)+list.get(rpp)==target){
                return true;
            }
            if(list.get(lpp)+list.get(rpp)<target){
                lpp=(lpp+1)%list.size();
            }else{
                rpp=(list.size()+rpp-1)%list.size();
            }
        }
        return false;
    }

}
