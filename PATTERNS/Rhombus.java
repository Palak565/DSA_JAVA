import java.util.Scanner;

public class Rhombus {
    public static void SolidRhombus(int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= row-i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= row; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void HollowRhombus(int row){
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= row-i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= row; k++){
                if (i == 1 || i == row || k == 1 || k == row){
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
        int n = sc.nextInt();
        SolidRhombus(n);
        System.out.println('\n');
        HollowRhombus(n);
        sc.close();
    }
}
