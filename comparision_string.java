class comparision_string{
    public static void main(String[] args){
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1 == s2){
            System.out.print("equqls");
        }else{
            System.out.print("not equal");
        }

        if(s1.equals(s3)){
            System.out.print("equqls");
        }else{
            System.out.print("not equal");
        }
    }
}