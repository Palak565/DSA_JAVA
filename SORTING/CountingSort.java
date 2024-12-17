public class CountingSort {
    public static void countingsort(int arr[]){
        int n = arr.length, max = Integer.MIN_VALUE;
        // calculate max for range 0 to max
        for (int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
        }

        // initialise count[] with zeroes
        int count[] = new int[max+1];
        for (int i = 0; i <= max; i++){
            count[i] = 0;
        }

        // update count
        for (int i = 0; i < n; i++){
            count[arr[i]]++;
        }

        // sort
        int j = 0;
        for (int i = 0; i <= max; i++){
            while (count[i] > 0){
                arr[j++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 3, 8, 2, 4, 1, 3, 8};
        countingsort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
