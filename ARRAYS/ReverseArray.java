public class ReverseArray {
    public static void revArray(int arr[]){
        int mid = arr.length/2, n = arr.length;
        for (int i = 0; i < mid; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        revArray(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
