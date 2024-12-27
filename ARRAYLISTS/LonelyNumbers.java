import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {
    // Brute approach -> TC = O(n^2) SC= O(1)
    public static ArrayList<Integer> lonely_numsI(ArrayList<Integer> arr){
        int n = arr.size();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int lonely = 1;
            int curr = arr.get(i);
            for (int j = 0; j < n; j++){
                if (j == i){
                    continue;
                }

                int other = arr.get(j);
                if (other == curr || other == curr-1 || other == curr+1){
                    lonely = 0;
                    break;
                } 
            }
            if (lonely == 1){
                res.add(curr);
            }
        }
        return res;
    }

    // Optimised approach -> TC = O(nlogn) SC = O(1)
    public static ArrayList<Integer> lonely_numsII(ArrayList<Integer> arr){
        Collections.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i < arr.size()-1; i++){
            if (arr.get(i-1) + 1 < arr.get(i) && arr.get(i) + 1 < arr.get(i+1)){
                res.add(arr.get(i));
            }
        }

        // if size = 1, the number will surely be lonely
        if (arr.size() == 1){
            res.add(arr.get(0));
        }


        // check if 0th and (n-1)th elements are lonely by comparing with 1st & (n-2)th elements respectively
        if (arr.size() > 1){
            if (arr.get(0) + 1 < arr.get(1)){
                res.add(arr.get(0));
            }

            if (arr.get(arr.size()-2) + 1 < arr.get(arr.size()-1)){
                res.add(arr.get(arr.size()-1));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(3);
        System.out.println("Lonely numbers in " + arr + ": " + lonely_numsI(arr)); 
        // Lonely numbers in [1, 3, 5, 3]: [1, 5]
        System.out.println("Lonely numbers in " + arr + ": " + lonely_numsII(arr));
        // Lonely numbers in [1, 3, 5, 3]: [1, 5]
    }
}
