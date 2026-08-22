import java.util.*;
public class Hash_Set_Iteration{
    public static void main(String[] args){
        HashSet<String> city=new HashSet<>();
        city.add("Ambajogai");
        city.add("RAdi");
        Iterator it=city.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        for(String cit:city){
            System.out.print(cit);
        }
    }
}