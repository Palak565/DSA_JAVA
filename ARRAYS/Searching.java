public class Searching {
    public static int LinearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++){
            if (key == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int BinSearch(int arr[], int key, int start, int end){
            if (start <= end){
                int mid = (start + end)/2;
                if (key == arr[mid]){
                    return mid;
                } else if (arr[mid] > key){
                    return BinSearch(arr, key, start, mid-1);
                } else {
                    return BinSearch(arr, key, mid+1, end);
                }
            } 
            return -1;
}

    public static void main(String[] args) {
        int arr[] = {5, 9, 31, 45, 2, 8, 21};
        System.out.println(31 + " is present at index " + LinearSearch(arr, 31) + " of array");
        System.out.println(31 + " is present at index " + BinSearch(arr, 31, 0, 6) + " of array");
    }
}
