class Solution {
    public static int sol(int n, Integer dp[]) {
        if (n <= 3)
            return n;
        if (dp[n] != null)
            return dp[n];
        return dp[n] = sol(n - 1, dp) + sol(n - 2, dp);
    }

    public int climbStairs(int n) {
        Integer dp []= new Integer[n + 1];
        
        return sol(n, dp);
    }
}