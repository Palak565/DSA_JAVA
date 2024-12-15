import java.util.*;

public class NumberPyramid {
    public static void DrawNumberPyramid(int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= row-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        DrawNumberPyramid(n);
        sc.close();
    }
}
