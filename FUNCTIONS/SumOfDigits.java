import java.util.*;

public class SumOfDigits {
    public static int sumofdigits(int n){
        int sum = 0;
        while (n > 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Sum of digits of " + n + " = " + sumofdigits(n));
        sc.close();
    }
}
