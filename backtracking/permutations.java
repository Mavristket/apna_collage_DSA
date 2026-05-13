class permutations{
    public static void check(String str,String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            String curr=str.charAt(i)+"";
            String newStr=str.substring(0,i)+str.substring(i+1);
            check(newStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        check(str,"");
        System.out.println("Complexity is O(n*n!)");
        System.out.println("Complexity is O(n*n!)");
        
    }
    
}