import java.util.*;
public class Linked_hash_map{
    public static void main(String[] args){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",200);
        lhm.put("Us",50);
        System.out.print(lhm);

        TreeMap<String,Integer> hm=new TreeMap<>();
        hm.put("India",100);
        hm.put("China",200);
        hm.put("Us",50);
        System.out.print(hm);
    }
}