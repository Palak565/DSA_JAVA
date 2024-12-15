import java.util.*;

public class HalfPyramid {
    public static void InvertedRotatedHalfPyramid(int row){
        for (int i = 1; i <= row; i++ ){
            for (int j = 1; j <= row-i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int row = sc.nextInt();
        InvertedRotatedHalfPyramid(row);
        sc.close();
    }
}
