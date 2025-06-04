import java.util.HashMap;

public class LargestSubarrayWithZeroSum {
    public static int largestSubarray(int arr[]){
        int sum = 0, len = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (mp.containsKey(sum)){
                len = Math.max(len, i-mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10};
        System.out.println("Length of largest subarray with sum 0 is: " + largestSubarray(arr));
    }
}
