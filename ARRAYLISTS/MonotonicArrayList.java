import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean isMonotone(ArrayList<Integer> arr){
        boolean incr = true, decr = true;
        for (int i = 0; i < arr.size()-1; i++){
            if (arr.get(i) > arr.get(i+1)){
                incr = false;
            }
            if (arr.get(i) < arr.get(i+1)){
                decr = false;
            }
        }

        return incr || decr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(0);
        System.out.println("Is " + arr + " monotone? " + isMonotone(arr)); // Is [1, 2, 2, 0] monotone? false
    }
}
