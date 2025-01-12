import java.util.ArrayList;

public class AllOccurences {
    public static void allOccurences(int arr[], int key, int i, ArrayList<Integer> ans){
        if (i == arr.length){
            System.out.println(ans);
            return;
        }

        if (arr[i] == key){
            ans.add(i);
        }
        allOccurences(arr, key, i+1, ans);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allOccurences(arr, key, 0, new ArrayList<>());
    }
}
