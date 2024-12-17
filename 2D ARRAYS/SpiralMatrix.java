import java.util.Scanner;

public class SpiralMatrix {
    public static int[][] createMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows & col:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }

    public static void printMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiralMatrix(int arr[][]){
        int startrow = 0, endrow = arr.length-1;
        int startcol = 0, endcol = arr[0].length-1;
        
        while (startrow <= endrow && startcol <= endcol){
            // top
            for (int j = startcol; j <= endcol; j++){
                System.out.print(arr[startrow][j] + " ");
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++){
                System.out.print(arr[i][endcol] + " ");
            }

            // down
            for (int j = endcol-1; j >= startcol; j--){
                if (startrow == endrow){
                    return;
                }
                System.out.print(arr[endrow][j] + " ");
            }

            //left
            for (int i = endrow-1; i > startrow; i--){
                if (startcol == endcol){
                    return;
                }
                System.out.print(arr[i][startcol] + " ");
            }

            
            startcol++; endcol--;
            startrow++; endrow--;
        }
    }

    public static void main(String[] args) {
        int mat[][] = createMatrix();
        printMatrix(mat);
        spiralMatrix(mat);
    }
}
