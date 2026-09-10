class Solution {
    public boolean sol(int i, int arr[],Boolean dp[]) {
        if (i >= arr.length)
            return false;
        if (i == arr.length - 1)
            return true;
        if(dp[i]!=null) return dp[i];
        boolean ans = false;
        for (int j = 1; j <= arr[i]; j++) {
            ans = sol(j + i, arr,dp);
            if (ans) {
                break;
            }

        }
        return dp[i]=ans;

    }

    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean dp[] = new Boolean[n+1];
        return sol(0, nums,dp);
    }
}