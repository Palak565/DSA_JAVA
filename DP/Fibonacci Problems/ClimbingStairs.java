import java.util.*;

public class ClimbingStairs {
    public static int ways(int n, int dp[]){
        if (n == 0){
            return 1;
        } else if (n < 0){
            return 0;
        }

        if (dp[n] != 0){
            return dp[n];
        }
        dp[n] = ways(n-1, dp) + ways(n-2, dp);
        return dp[n];
    }

    public static int waysTabulation(int n, int[] dp){
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        System.out.println(waysTabulation(n, dp));
    }
}
