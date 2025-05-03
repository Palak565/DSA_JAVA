public class Knapsack01 {
    public static int knap01(int val[], int wt[], int W, int n){
        if (n == 0 || W == 0){
            return 0;
        }

        if (W >= wt[n-1]){
            // include
            int ans1 = val[n-1] + knap01(val, wt, W-wt[n-1], n-1);
            // exclude
            int ans2 = knap01(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        }
        return knap01(val, wt, W, n-1);
    }

    public static int knap01DP(int val[], int wt[], int W, int n, int dp[][]){
        if (n == 0 || W == 0){
            return 0;
        }

        if (dp[n][W] != -1){
            return dp[n][W];
        }
        
        if (W >= wt[n-1]){
            // include
            int ans1 = val[n-1] + knap01(val, wt, W-wt[n-1], n-1);
            // exclude
            int ans2 = knap01(val, wt, W, n-1);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        }
        dp[n][W] = knap01(val, wt, W, n-1);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int n = val.length, W = 7;
        System.out.println(knap01(val, wt, W, val.length));
        int dp[][] = new int[n+1][W+1];
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= W; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(knap01DP(val, wt, W, n, dp));

    }
}
