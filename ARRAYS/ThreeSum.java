import java.util.*;
//import java.util.List;

public class ThreeSum {
    public static int[][] tripletsI(int arr[]){
        // Duplicates allowed
        int n = arr.length, m = 0;
        int ans[][] = new int[n][3];
        
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("i = " + i + " j = " + j + " k = " + k);
                        ans[m][0] = arr[i];
                        ans[m][1] = arr[j];
                        ans[m][2] = arr[k];
                        m++;
                    }
                }
            }
        }
        
        
        return ans;
    }


    public static List<List<Integer>> tripletsII(int arr[]){
        // No duplicates
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            if (i > 0 && arr[i] == arr[i-1]){
                continue;
            }

            int j = i+1, k = arr.length-1;
            while (j < k){
                int temp = arr[i] + arr[j] + arr[k];
                if (temp > 0){
                    k--;
                } else if (temp < 0){
                    j++;
                } else {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    while (j < k && arr[j] == arr[j-1]){
                        j++;
                    }
                }
            }
        }
        for (List<Integer> list : res){
            System.out.println(list);
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {-1, -1, 1, 2, -4, 0};
        tripletsII(nums);
        /*
         [-1, -1, 2]
         [-1, 0, 1]
         */
    }
}
