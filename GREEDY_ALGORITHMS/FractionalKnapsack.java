import java.util.*;

public class FractionalKnapsack {
    public static int getMaxProfit(int weight[], int val[], int capacity){

        double ratio[][] = new double[weight.length][2];
        for (int i = 0; i < weight.length; i++){
            ratio[i][0] = i;                // index
            ratio[i][1] = val[i]/(double)weight[i]; // ratio
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> -o[1]));

        int value = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < ratio.length; i++){
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]){
                capacity -= weight[idx];
                value += val[idx];
                ans.add(idx);
            } else {
                value += (ratio[i][1] * capacity);
                capacity = 0;
                ans.add(idx);
                break;
            }
        }

        System.out.println("Selected items are:");
        for (int j = 0; j < ans.size(); j++){
            System.out.print("A" + ans.get(j) + "  ");
        }
        return value;
    }

    public static void main(String[] args) {
        int weight[] = {20, 30, 10};
        int val[] = {100, 120, 60};
        System.out.println("Total profit = " + getMaxProfit(weight, val, 50));
    }
}
