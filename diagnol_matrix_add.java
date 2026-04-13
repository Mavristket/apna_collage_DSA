class diagnol_matrix_add{
    public static void sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];

            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("Sum of diagonal elements: " + sum);

    }
    public static void main(String[] args){
        int matrix[][]={{1,2,3,3},{4,5,6,8},{7,8,9,12},{7,5,4,3}};
        sum(matrix);
    }
}