import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime (int n){
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = 2 ; i <= n; i++){
            if (prime(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
