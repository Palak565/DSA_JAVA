import java.util.Scanner;

public class Transpose {
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

    public static int[][] transpose(int arr[][]){
        int n = arr.length, m = arr[0].length;
        int[][] transp = new int[m][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                transp[j][i] = arr[i][j];
            }
        }
        return transp;
    }

    public static void main(String[] args) {
        int mat[][] = createMatrix();
        printMatrix(mat);
        System.out.println();
        int transp[][] = transpose(mat);
        printMatrix(transp);
    }
}
