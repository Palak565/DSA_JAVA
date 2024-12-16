public class SearchinRotatedSortedArray{
    public static int search(int arr[], int key, int start, int end){
        while (start <= end){
            int mid = (start+end)/2;

            if (arr[mid] >= arr[0]){
                if (key >= arr[mid] || key < arr[0]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if (key < arr[mid] || key >= arr[0]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }

            if (arr[mid] == key){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1};
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}