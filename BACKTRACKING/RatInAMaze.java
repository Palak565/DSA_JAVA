import java.util.Scanner;

public class RatInAMaze {
    public static void findPath(int maze[][], int row, int col, int vis[][], String ans){
        // base case
        if (row == maze.length-1 && col == maze.length-1){
            vis[row][col] = 1;
            printPath(vis);
            System.out.println(ans);
            return;
        }

        // right
        if (col+1 < maze.length && maze[row][col+1] == 1 && vis[row][col+1] == 0){
            vis[row][col] = 1;
            findPath(maze, row, col+1, vis, ans + 'R');
            vis[row][col] = 0;
        }
        
        // down
        if (row+1 < maze.length && maze[row+1][col] == 1 && vis[row+1][col] == 0){
            vis[row][col] = 1;
            findPath(maze, row+1, col, vis, ans + 'D');
            vis[row][col] = 0;
        }

        // left
        if (col-1 >= 0 && maze[row][col-1] == 1 && vis[row][col-1] == 0){
            vis[row][col] = 1;
            findPath(maze, row, col-1, vis, ans + 'L');
            vis[row][col] = 0;
        }

        

        // up
        if (row-1 >= 0 && maze[row-1][col] == 1 && vis[row-1][col] == 0){
            vis[row][col] = 1;
            findPath(maze, row-1, col, vis, ans + 'U');
            vis[row][col] = 0;
        }

        

        
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
        // int maze[][] = inputMaze();
        int maze[][] = {{1, 0, 0, 0}, 
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
        int path[][] = new int[maze.length][maze[0].length];
        for (int i = 0; i < path.length; i++){
            for (int j = 0; j < path.length; j++){
                path[i][j] = 0;
            }
        }
        findPath(maze, 0, 0, path, "");
        
    }
}
