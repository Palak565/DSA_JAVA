import java.util.HashMap;

public class SubarraySumK {
    public static int countSubarrays(int arr[], int k){
        int count = 0, sum = 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];

            if (sum == k){
                count++;
            }

            if (prefixMap.containsKey(sum-k)){
                count += prefixMap.get(sum-k);
            } 

            prefixMap.put(sum, prefixMap.getOrDefault(sum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10};
        int k = 0;
        System.out.println("Number of subarrays with sum " + k + " is: " + countSubarrays(arr, k));
    }
}
