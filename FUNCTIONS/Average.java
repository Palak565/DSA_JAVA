import java.util.*;

public class Average {
    public static float Avg(float a, float b, float c){
        float avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("Average = " + Avg(a, b, c));
        sc.close();
    }
}
