public class SudokuSolver {
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // base case
        if (row == 9){ // Complete grid traversed
            return true;
        }

        // updating row, col for next call
        int nextRow = row, nextCol = col+1;
        if (nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        // recursion
        if (sudoku[row][col] != 0){ // if current cell is already filled, move to the next cell
            return sudokuSolver(sudoku, nextRow, nextCol);
        } else { 
            for (int digit = 1; digit <= 9; digit++){
                if (isSafe(sudoku, row, col, digit)){
                    sudoku[row][col] = digit; // Place the digit
                    if (sudokuSolver(sudoku, nextRow, nextCol)){
                        return true; // If placing this digit leads to a solution, return true
                    } else {
                        sudoku[row][col] = 0; // Backtrack: Remove the digit and try the next one
                    }
                }
            }
        }

        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        // check row
        for (int i = 0; i < 9; i++){
            if (sudoku[i][col] == digit){
                return false;
            }
        }

        // check col
        for (int j = 0; j < 9; j++){
            if (sudoku[row][j] == digit){
                return false;
            }
        }

        // check grid
        int srow = (row/3)*3, scol = (col/3)*3;
        for (int i = srow; i < srow+3; i++){
            for (int j = scol; j < scol+3; j++){
                if (sudoku[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSudoku(int sudoku[][]){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = { {0,0,0,2,0,7,0,0,0},
        {0,4,0,0,9,0,2,5,0},
        {0,0,2,0,8,0,6,0,0},
        {4,0,0,0,0,0,0,0,9},
        {0,2,7,0,0,0,1,6,0},
        {5,0,0,0,0,0,0,0,2},
        {0,0,6,0,3,0,7,0,0},
        {0,9,0,0,5,0,0,8,6},
        {0,0,0,1,0,6,0,0,0} };
        sudokuSolver(sudoku, 0, 0);
        printSudoku(sudoku);
    }
}
