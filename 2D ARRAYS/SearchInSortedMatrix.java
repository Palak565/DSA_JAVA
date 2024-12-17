import java.util.Scanner;

public class SearchInSortedMatrix {
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

    public static void searchinSortedMatrix(int arr[][], int key){
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m-1;
        while ((i != 0 && j != 0) || (i != n-1 && j != 0) || (i != n-1 && j != m-1)){
            if (key == arr[i][j]){
                System.out.println(key + " is at index (" + i + "," + j + ")");
                return;
            } else if (key < arr[i][j]){
                j--;
            } else {
                i++;
            }
        }
        System.out.println(key + " is not found in matrix");
    }

    public static void main(String[] args) {
        int mat[][] = createMatrix();
        printMatrix(mat);
        searchinSortedMatrix(mat, 33);
    }
}
