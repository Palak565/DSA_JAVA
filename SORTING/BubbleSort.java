public class BubbleSort {
    public static void bubblesort(int arr[]){
        int n = arr.length;
        int swap = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if (swap == 0){
                // Already sorted
                return;
            }
        }
    }
    public static void main(String[] args) {
        {
            int arr1[] = {5, 4, 1, 3, 2};
            int arr2[] = {1, 2, 3, 4, 5};
            bubblesort(arr1);
            for (int i : arr1){
                System.out.print(i + " ");
            }
            System.out.println();
            bubblesort(arr2);
            for (int i : arr2){
                System.out.print(i + " ");
            }
        }
    }
}
