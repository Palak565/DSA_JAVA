

public class TripletsSum {
    public static int[][] triplets(int arr[]){
        int n = arr.length, m = 0;
        int ans[][] = new int[n][3];
        
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("i = " + i + " j = " + j + " k = " + k);
                        ans[m][0] = arr[i];
                        ans[m][1] = arr[j];
                        ans[m][2] = arr[k];
                        System.out.println("(" + ans[m][0] + "," + ans[m][1] + ", " + ans[m][2] + ")");
                        m++;
                    }
                }
            }
        }
        
        
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        triplets(nums);
    }
}
