import java.util.*;

public class IsEven {
    public static boolean isEven(int x){
        if (x % 2 == 0){
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Is " + a + " even? " + isEven(a));
        sc.close();
    }
}
