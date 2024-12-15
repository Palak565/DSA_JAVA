public class Largest {
    public static int ArrayMax(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {12, 45, 56, 32, 21, 19};
        System.out.println("Max of array: " + ArrayMax(arr));
    }
}
