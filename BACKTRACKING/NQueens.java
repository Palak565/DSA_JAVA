public class NQueens {
    static int count = 0;
    public static void nqueens(char board[][], int row) {
        // base case
        if (row == board.length){
            printBoard(board);
            count++;
            return;
        }

        // kaam
        for (int j = 0; j < board.length; j++){
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                nqueens(board, row+1); // Fxn call
                board[row][j] = 'x'; // Backtracking step
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        // vertically up
        for (int i = 0; i < row; i++){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonally left
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonally right
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("____Chess board_____");
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = 'x';
            }
        }
        nqueens(board, 0);
        System.out.println(count);
    }
}
