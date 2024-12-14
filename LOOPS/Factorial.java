import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n = sc.nextInt();
        int fact = 1;
        if (n < 0){
            System.out.println("Factorial doesn't exist for negative numbers!");
        } else {
            int i = 2;
            while (i <= n){
                fact *= i;
                i++;
            }
            System.out.println("Factorial = " + fact);
        }
        sc.close();
    }
}
