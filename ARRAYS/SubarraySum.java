public class SubarraySum {
    public static int MaxSubarraySum1(int arr[]){
        int n = arr.length;
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){                     // i      -> START
            for (int j = i; j < n; j++){                 // j      -> END
                for (int k = i; k <= j; k++){            // i to j -> SUBARRAY
                    currSum += arr[k];
                }
                if (currSum > maxSum){
                    maxSum = currSum;
                }
                currSum = 0;
            }
        }
        System.out.println("Maxsum (Brute force)= " + maxSum);
        return maxSum;
    }


    public static int PrefixSum(int arr[]){
        int n = arr.length;
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[n];
        prefixArr[0] = arr[0];

        // Prefix array
        for (int i = 1; i < n; i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (i == 0){
                    currSum = prefixArr[j];
                } else {
                    currSum = prefixArr[j] - prefixArr[i-1];
                }
                
                if (maxSum < currSum){
                    maxSum = currSum;
                }
                currSum = 0;
            }
        }
        System.out.println("Using Prefix sum, max subarray sum = " + maxSum);
        return maxSum;
    }

    public static int KadanesAlgo(int arr[]){
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if (currSum < 0){
                currSum = 0;
            } 

            if (maxSum < currSum){
                maxSum = currSum;
            }
        }
        System.out.println("Using Kadane's algo, max subarray sum = " + maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        MaxSubarraySum1(arr);
        PrefixSum(arr);
        KadanesAlgo(arr);
    }
}
