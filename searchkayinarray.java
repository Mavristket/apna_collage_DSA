import java.util.Scanner;
class searchkayinarray{
    public static void main(String[] args){
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        int key=5;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key found at: ("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("Key not found");
    }
}