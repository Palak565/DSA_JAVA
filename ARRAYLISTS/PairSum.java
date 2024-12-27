import java.util.ArrayList;

public class PairSum {
    // Sorted arraylist
    public static boolean pairsumI(ArrayList<Integer> arr, int target){
        int l = 0, r = arr.size()-1;

        while (l < r){
            int sum = arr.get(l) + arr.get(r);
            if (sum == target){
                return true;
            } else if (sum < target){
                l++;
            } else {
                r--;
            }
        }
        return false;
    }

    // Rotated sorted arraylist
    public static boolean pairsumII(ArrayList<Integer> arr, int target){
        int n = arr.size(), pivot = -1;

        // find pivot(largest element)
        for (int i = 0; i < n-1; i++){
            if (arr.get(i) > arr.get(i+1)){
                pivot = i;
                break;
            }
        }

        int j = (pivot == -1) ? n-1 : pivot;
        int i = (pivot == -1) ? 0 : pivot+1;
        while (i != j){
            int sum = arr.get(i) + arr.get(j);
            if (sum == target){
                return true;
            } else if (sum < target){
                i = (i+1) % n;
            } else {
                j = (n+j-1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int target1 = 5, target2 = 16;
        System.out.println("Is any pair summing to " + target1 + " present in arraylist? " + pairsumI(arr, target1));
        System.out.println("Is any pair summing to " + target2 + " present in arraylist? " + pairsumII(arr, target2));
    }
}
