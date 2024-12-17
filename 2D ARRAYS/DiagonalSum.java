import java.util.Scanner;

public class DiagonalSum {
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

    public static int diagonalSum(int arr[][]){
        int n = arr.length, m = arr[0].length;
        if (n != m){
            System.out.println("Diagonal sum can't be calculated!");
            return Integer.MIN_VALUE;
        }

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i][i] + arr[i][n-1-i];
        }

        if (n % 2 != 0){
            sum -= arr[n/2][n/2];
        }
        System.out.println("Diagonal sum = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = createMatrix();
        printMatrix(mat);
        diagonalSum(mat);
    }
}
