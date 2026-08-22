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

        LinkedHashSet<String> lh=new LinkedHashSet<>();
        lh.add("Patna");
        lh.add("Bihar");

        for(String cit:lh){
            System.out.print(cit);
        }
        TreeSet<String> ts=new TreeSet<>();
        ts.add("baaji");
        ts.add("Ramraje");

        System.out.print(ts);


    }
}