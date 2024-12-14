import java.util.*;
public class Bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter costs of pen, pencil and eraser:");
        float penCost = sc.nextFloat();
        float pencilCost = sc.nextFloat();
        float eraserCost = sc.nextFloat();
        float totalcost = penCost + pencilCost + eraserCost;
        float tax = 0.18f * totalcost;
        System.out.println("Total cost w/o tax: Rs" + totalcost);
        System.out.println("Total cost with tax: Rs" + (totalcost + tax));
        sc.close();
    }
}
