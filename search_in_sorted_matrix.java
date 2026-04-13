class search_in_sorted_matrix{
    public static boolean search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==key){
                return true;
            }
            else if(matrix[row][col]>key){
                col--;
            }
            else{
                row++;
            }
            }
        return false;
            }
    public static void main(String[] args){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=10; 
        if(search(matrix,key)){
            System.out.println("Element found in the matrix.");
        }
        else{
            System.out.println("Element not found in the matrix.");

        }
    }
}