public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b); // Before swap: a = 5, b = 10
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swap: a = " + a + ", b = " + b); // After swap: a = 10, b = 5
    }
}
