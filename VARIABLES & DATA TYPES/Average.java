import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers:");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("Average of " + a + ", " + b + "and " + c + " = " + avg);
    }
}