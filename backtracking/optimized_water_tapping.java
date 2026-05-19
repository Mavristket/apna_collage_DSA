import java.util.*;
class optimized_water_tapping{

    public static void main(String[] args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(10);
        height.add(20);
        height.add(30);
        height.add(40);
        height.add(50);
        height.add(60);

        System.out.print(tapp(height));
    }
    public static int tapp(ArrayList<Integer> height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int hi=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int curr=hi*width;
            maxwater=Math.max(maxwater,curr);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp++;
            }
        }
        return maxwater;
    }
}