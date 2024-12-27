public class StringMergeSort {
    public static void mergesort_String(String[] arr, int start, int end){
        if (start >= end){
            return;
        }

        int mid = (start + end)/2;
        mergesort_String(arr, start, mid);
        mergesort_String(arr, mid+1, end);
        merge_String(arr, start, mid, end);
    }

    public static void merge_String(String[] arr, int start, int mid, int end){
        int i = start, j = mid+1, k = 0;
        String[] temp = new String[end-start+1];

        while (i <= mid && j <= end){
            if (arr[i].compareTo(arr[j]) <= 0){
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
        String[] arr = { "sun", "earth", "mars", "mercury"};
        System.out.println("String array before sorting:");
        for (String i : arr){
            System.out.print(i + " ");
        }
        // sun earth mars mercury
        
        mergesort_String(arr, 0, arr.length-1);
        System.out.println("\n\nString array after sorting:");
        for (String i : arr){
            System.out.print(i + " ");
        }
        // earth mars mercury sun
    }
}
