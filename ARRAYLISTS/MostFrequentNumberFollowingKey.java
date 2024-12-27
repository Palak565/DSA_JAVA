import java.util.ArrayList;

public class MostFrequentNumberFollowingKey {
    // TC = O(n)  SC = O(1)
    public static int mostFrequentNumber(ArrayList<Integer> arr, int key){
        int count[] = new int[1000];
        for (int i = 0; i < arr.size()-1; i++){
            if (arr.get(i) == key){
                count[arr.get(i+1)-1]++;
            }
        }

        int max = count[0], target = 1;
        for (int i = 1; i < 1000; i++){
            if (max < count[i]){
                max = count[i];
                target = i+1;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(100);
        arr.add(200);
        arr.add(1);
        arr.add(100);
        int key = 1;
        System.out.println("Most freq no. following key " + key + " is: " + mostFrequentNumber(arr, key));
        // Most freq no. following key 1 is: 100
    }
}
