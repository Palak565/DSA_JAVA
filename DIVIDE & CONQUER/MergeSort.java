public class MergeSort {
    public static void mergesort(int arr[], int start, int end){
        if (start < end){
            int mid = start + (end-start)/2;
            mergesort(arr, start, mid);
            mergesort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int arr[], int start, int mid, int end){
        int i = start, j = mid+1, k = 0;
        int temp[] = new int[end-start+1];

        while (i <= mid && j <= end){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
            k++;
        }

        while (i <= mid){
            temp[k++] = arr[i++];
        }

        while (j <= end){
            temp[k++] = arr[j++];
        }

        for (i = start; i <= end; i++){
            arr[i] = temp[i-start];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 2, 8, 1, 5};
        System.out.println("Array before sorting:");
        for (int i : arr){
            System.out.print(i + " ");
        }
        // 3 5 7 2 8 1 5 

        mergesort(arr, 0, arr.length-1);
        System.out.println("\nArray after sorting:");
        for (int i : arr){
            System.out.print(i + " ");
        }
        // 1 2 3 5 5 7 8
    }
}
