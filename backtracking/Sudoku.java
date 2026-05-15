class Sudoku {

    // Check whether placing num is safe
    public static boolean isSafe(int[][] board, int row, int col, int num) {

        // Row check
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Column check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // 3x3 grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Solve Sudoku using backtracking
    public static boolean check(int[][] board, int row, int col) {

        if (row == 9) {
            return true;
        }

        int newcol = col + 1;
        int newrow = row;

        if (newcol == 9) {
            newcol = 0;
            newrow = row + 1;
        }

        // Skip filled cells
        if (board[row][col] != 0) {
            return check(board, newrow, newcol);
        }

        // Try numbers 1 to 9
        for (int num = 1; num <= 9; num++) {

            if (isSafe(board, row, col, num)) {

                board[row][col] = num;

                if (check(board, newrow, newcol)) {
                    return true;
                }

                // Backtracking
                board[row][col] = 0;
            }
        }

        return false;
    }

    // Print board
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,5,8,6,7,9,1}
        };

        if (check(board, 0, 0)) {
            System.out.println("Solved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("No Solution Exists");
        }
    }
}