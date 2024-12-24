import java.util.Scanner;

public class RatInAMaze {
    public static boolean findPath(int maze[][], int row, int col, int path[][]){
        // base case
        if (row == maze.length-1 && col == maze.length-1){
            path[row][col] = 1;
            return true;
        }

        path[row][col] = 1;
        // path
        // right
        if (col + 1 < maze.length && maze[row][col+1] == 1 && path[row][col+1] == 0){
            if (findPath(maze, row, col+1, path)){
                return true;
            }
        }

        // down
        if (row + 1 < maze.length && maze[row+1][col] == 1 && path[row+1][col] == 0){
            if (findPath(maze, row+1, col, path)){
                return true;
            }
        }

        // left
        if (col - 1 >= 0 && maze[row][col-1] == 1 && path[row][col-1] == 0){
            if (findPath(maze, row, col-1, path)){
                return true;
            }
        }

        // up
        if (row - 1 >= 0 && maze[row-1][col] == 1 && path[row-1][col] == 0){
            if (findPath(maze, row-1, col, path)){
                return true;
            }
        }

        path[row][col] = 0;
        return false;
    }

    public static void printPath(int path[][]){
        System.out.println();
        for (int i = 0; i < path.length; i++){
            for (int j = 0; j < path.length; j++){
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] inputMaze(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and cols in maze:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maze[][] = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return maze;
    }

    public static void main(String[] args) {
        int maze[][] = inputMaze();
        int path[][] = new int[maze.length][maze[0].length];
        path[0][0] = 1;
        if (maze[0][0] == 0 || maze[maze.length][maze[0].length] == 0){
            System.out.println("No solution for maze!");
        }
        if (findPath(maze, 0, 0, path)){
            printPath(path);
        }
        
    }
}
