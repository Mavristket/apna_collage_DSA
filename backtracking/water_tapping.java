import java.util.*;
class water_tapping{
    public static int tapp(ArrayList<Integer> height){
        int maxwater=0;;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int hi=Math.min(height.get(j),height.get(i));
                int widht=j-i;
                int curr=hi*widht;
                maxwater=Math.max(maxwater,curr);
            }
        }
        return maxwater;
    }
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
}