import java.util.*;
/*
  1 2 3 4 5
1 1
2 0 1
3 1 0 1
4 0 1 0 1
5 1 0 1 0 1
 */
public class ZeroOneTriangle {
    public static void zero_one_triangle(int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++){
                if ((i + j) % 2 == 0){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = sc.nextInt();
        zero_one_triangle(n);
        sc.close();
    }
}
