public class BuyandSellStocks {
    public static int Arraymax(int arr[], int start, int end){
        int max = arr[start];
        for (int i = start+1; i <= end; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int Arraymin(int arr[], int start, int end){
        int min = arr[start];
        for (int i = start+1; i <= end; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;

    }
    public static int MaxProfit (int arr[]){
        int minPrice, n = arr.length, currProfit = 0, maxProfit = 0;
        int maxPrice ;
        
        for (int i = 0; i < n; i++){
            minPrice = Arraymin(arr, 0, i);
            maxPrice = Arraymax(arr, i, n-1);
            currProfit = maxPrice - minPrice;
            if (currProfit > maxProfit){
                maxProfit = currProfit;
            }
        }
        System.out.println("Max profit = " + maxProfit);
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4, 10};
        MaxProfit(arr);
    }
}

