class subset_string{
    public static void subset(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        subset(str,i+1,ans+str.charAt(i));
        subset(str,i+1,ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        subset(str, 0, "");
    }
}