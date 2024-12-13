import java.util.*;
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square:");
        float a = sc.nextFloat();
        float area = a*a;
        System.out.println("Area of square with side " + a + "units = " + area + "sq units");
    }
}
