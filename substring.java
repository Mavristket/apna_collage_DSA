class substring{
    public static String sub(String str,int start,int end){
        String substr="";
        for(int i=start;i<end;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args){
        String str="balaji gaikwad";
        String sub=sub(str,0,6);
        System.out.println(sub);
        System.out.println(str.substring(0,6));


}
}