public class Subarray {
    public static void printSubarray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int k = i; k < n; k++){
                for (int j = i; j <= k; j++){
                    if (j != k){
                        if (j == i){
                            System.out.print("(");
                        } 
                        System.out.print(arr[j] + ", ");
                         
                    } else {
                        if (i == k){
                            System.out.print("(");
                        }
                        System.out.print(arr[j] + ")  ");
                    }
                }
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printSubarray(arr);
    }
}
