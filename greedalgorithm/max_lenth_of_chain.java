import java.util.*;
public class max_lenth_of_chain{
    public static void main(String[] args){
        int pairs[][]={{5,24},{15,25},{27,40},{50,60}};
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        int chainlen=1;
        int lastend=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>=lastend){
                chainlen++;
                lastend=pairs[i][1];
            }
        }  
        System.out.print(chainlen);
    }
}