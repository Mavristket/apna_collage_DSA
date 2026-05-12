class N_queens_count {
    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];

        // Call the recursive function
        nQueens(board, 0);

        System.out.println("Total solutions: " + count);
        System.out.println("Complexity is O(n!)");
    }

    public static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void nQueens(int[][] board, int row) {

        // Base case
        if (row == board.length) {
            count++;
            return;
        }

        // Try placing queen in each column
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 1;

                nQueens(board, row + 1);

                // Backtracking
                board[row][j] = 0;
            }
        }
    }

    public static boolean issafe(int[][] board, int row, int col) {

        // Vertical check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}