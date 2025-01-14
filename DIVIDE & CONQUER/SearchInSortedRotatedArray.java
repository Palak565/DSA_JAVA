public class SearchInSortedRotatedArray {
    public static int modifiedBinarySearch(int arr[],int key, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = (start + end)/2;
        // key found
        if (arr[mid] == key){
            return mid;
        }

        // mid on line1
        if (arr[mid] >= arr[0]){ 
            if (key >= arr[0] && key < arr[mid]){ 
                // left of mid
                return modifiedBinarySearch(arr, key, start, mid-1);
            } else { 
                // right of mid
                return modifiedBinarySearch(arr, key, mid+1, end);
            }
        } else { 
            // mid on line2
            if (key > arr[mid] && key < arr[0]){ 
                // right of mid
                return modifiedBinarySearch(arr, key, mid+1, end);
            } else { 
                // left of mid
                return modifiedBinarySearch(arr, key, start, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(modifiedBinarySearch(arr, 5, 0, arr.length-1));
        System.out.println(modifiedBinarySearch(arr, 1, 0, arr.length-1));
        System.out.println(modifiedBinarySearch(arr, 3, 0, arr.length-1));
    }
}
