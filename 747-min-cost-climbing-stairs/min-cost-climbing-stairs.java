class Solution {
    public int sol(int[] cost, int n, Integer dp[]) {
        if (n <= 1)
            return cost[n];
        if (dp[n] != null)
            return dp[n];
        return dp[n] = Math.min(sol(cost, n - 1, dp), sol(cost, n - 2, dp)) + cost[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        Integer dp[] = new Integer[cost.length + 1];
        return Math.min(sol(cost, cost.length - 1, dp), sol(cost, cost.length - 2, dp));
    }
}