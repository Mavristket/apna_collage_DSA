class Print_queens_arrangement {

    public static void main(String[] args) {

        int n = 4;

        int[][] board = new int[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                board[i][j] = 0;
            }
        }

        // Function call
        if (nQueens(board, 0)) {

            System.out.println("Possible Arrangement:");

            display(board);

        } else {

            System.out.println("No Solution");
        }

        System.out.println("Complexity is O(n!)");
    }

    // Display board
    public static void display(int[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    // N Queens function
    public static boolean nQueens(int[][] board, int row) {

        // Base condition
        if (row == board.length) {

            return true;
        }

        // Try every column
        for (int j = 0; j < board.length; j++) {

            if (issafe(board, row, j)) {

                board[row][j] = 1;

                // Recursive call
                if (nQueens(board, row + 1)) {

                    return true;
                }

                // Backtracking
                board[row][j] = 0;
            }
        }

        return false;
    }

    // Check safe position
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