public class EvenOdd {
    public static void evenOdd(int n){
        if ((n & 1) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        evenOdd(5); // Odd
        evenOdd(8); // Even
    }
}
