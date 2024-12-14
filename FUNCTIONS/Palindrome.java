import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(int num) {
        int rev = 0, n = num;
        while (n > 0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        if (rev == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Is " + a + " a palindrome? " + isPalindrome(a));
        sc.close();
    }
}
