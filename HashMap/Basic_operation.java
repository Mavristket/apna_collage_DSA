import java.util.*;
public class Basic_operation{
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.print(hm);
        System.out.print(hm.get("India"));


        Set<String> keys=hm.keySet();
        System.out.print(keys);

        for(String k:keys){
            System.out.println("Key"+k+"Value"+hm.get(k));
        }
    }

}