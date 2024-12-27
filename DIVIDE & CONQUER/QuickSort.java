public class QuickSort {
    public static void quicksort(int arr[], int start, int end){
        if (start >= end){
            return;
        }

        int pivot = arr[start];
        int i = start, j = end+1;

        while (i <= j){
            do i++; while (i <= end && arr[i] <= pivot);
            do j--; while (j > start && arr[j] > pivot);

            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;
        quicksort(arr, start, j-1);
        quicksort(arr, j+1, end);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 2, 8, 1, 5};
        System.out.println("Array before sorting:");
        for (int i : arr){
            System.out.print(i + " ");
        }
        // 3 5 7 2 8 1 5 
        
        quicksort(arr, 0, arr.length-1);
        System.out.println("\nArray after sorting:");
        for (int i : arr){
            System.out.print(i + " ");
        }
        // 1 2 3 5 5 7 8 
    }
}
