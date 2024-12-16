public class Subarray {
    public static void printSubarray(int arr[]){
        int n = arr.length;
        for (int s = 0; s < n; s++){
            for (int l = s; l < n; l++) {
                for (int j = s; j <= l; j++){
                    if (j == s){
                        System.out.print("(");
                    } 
                    System.out.print(arr[j]);
                    if (j < l){
                        System.out.print(",");
                    } else {
                        System.out.print(") ");
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
