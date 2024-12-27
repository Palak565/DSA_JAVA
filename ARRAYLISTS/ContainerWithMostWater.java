import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int maxWaterI(ArrayList<Integer> heights){
        int max = 0;
        for (int i = 0; i < heights.size(); i++){
            for (int j = i+1; j < heights.size(); j++){
                int width = j-i;
                int height = Math.min(heights.get(i), heights.get(j));
                max = Math.max(max, height*width);
            }
        }
        return max;
    }

    public static int maxWaterII(ArrayList<Integer> heights){
        int max = 0;
        int left = 0, right = heights.size()-1;

        while (left < right){
            int w = right - left;
            int h = Math.min(heights.get(left), heights.get(right));
            max = Math.max(max, h*w);

            if (heights.get(left) < heights.get(right)){
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ht = new ArrayList<>();
        ht.add(1);
        ht.add(8);
        ht.add(6);
        ht.add(2);
        ht.add(5);
        ht.add(4);
        ht.add(8);
        ht.add(3);
        ht.add(7);
        System.out.println(maxWaterI(ht));
        System.out.println(maxWaterII(ht));
    }
}
