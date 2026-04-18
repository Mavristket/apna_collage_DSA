class getterandsetter{
    private int age;

    int getage(){
        return this.age;
    }
    void setage(int age){
        this.age=age;
    }
    public static void main(String[] args){
        getterandsetter obj=new getterandsetter();
        obj.setage(25);
        System.out.println(obj.getage());
    }
}
