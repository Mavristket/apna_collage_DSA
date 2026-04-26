class removeduplictaes{
    public static void check(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            check(str, idx+1, newstr, map);
        }else{
            map[currchar-'a']=true; 
            check(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args){
        String str="appnnacollege";
        StringBuilder newstr=new StringBuilder("");
        boolean map[]=new boolean[26];
        check(str, 0, newstr, map);
    }
}