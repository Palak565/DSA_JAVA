import java.util.*;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of integers:");
        int n = sc.nextInt();
        int evenSum = 0, oddSum = 0;
        System.out.println("Enter n integers:");
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            if (a % 2 == 0){
                evenSum += a;
            } else {
                oddSum += a;
            }
        }
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
    }
}
