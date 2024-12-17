public class SelectionSort {
    public static void selectionsort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int minPos = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp; 
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionsort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
