import java.util.Arrays;

public class InsertionSort {
    public static void insertionsort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            // i-> Start of unsorted array
            int key = arr[i], j;
            for (j = i-1; j >= 0; j--){
                // j-> Sorted array
                if (arr[j] > key){
                    arr[j+1] = arr[j];
                }  else {
                    // if anyone element of sorted subarray is 
                    // not greater than key, break the inner loop
                    break;
                }
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2, 9};
        insertionsort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();
        int Arr[] = {3, 5, 1, 4, 7};
        Arrays.sort(Arr);
        for (int i : Arr){
            System.out.print(i + " ");
        }
    }
}
