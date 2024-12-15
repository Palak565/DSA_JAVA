import java.util.*;

public class HollowRectangle {
    public static void DrawHollowRect(int row, int col){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                if (i == 1 || i == row || j == 1 || j == col){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        DrawHollowRect(row, col);
        sc.close();
    }
}
